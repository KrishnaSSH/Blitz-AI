package com.krishna.blitzai.repository.network

import com.krishna.blitzai.database.entity.ChatMessage
import com.krishna.blitzai.model.network.request.GenerateAudioRequestBody
import com.krishna.blitzai.model.network.request.GenerateImageRequestBody
import com.krishna.blitzai.model.network.request.GenerateMessagesRequestBody
import com.krishna.blitzai.model.network.response.GenerateMessagesResponse
import com.krishna.blitzai.repository.base.BaseRepository
import com.krishna.blitzai.repository.network.service.OpenAIService
import com.krishna.blitzai.store.datastore.SettingsDataStore
import com.google.gson.Gson
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.currentCoroutineContext
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.isActive
import retrofit2.HttpException
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class OpenAIRepository @Inject constructor(
    private val openAIService: OpenAIService,
    private val settingsDataStore: SettingsDataStore,
    private val gson: Gson
): BaseRepository() {

    suspend fun generateAudio(
        model: String,
        input: String,
        voice: String,
        format: String,
        speed: Float
    ) = openAIService.generateAudio(
        GenerateAudioRequestBody(
            model = model,
            input = input,
            voice = voice,
            responseFormat = format,
            speed = speed
        )
    ).apply {
        if (errorBody() != null) {
            throw HttpException(this)
        }
    }.body()

    suspend fun generateImage(prompt: String) = openAIService.generateImage(
        GenerateImageRequestBody(prompt)
    ).data.first().url

    suspend fun generateMessagesStream(messages: List<ChatMessage>) = flow {
        val response = openAIService.generateMessagesStream(
            GenerateMessagesRequestBody(
                messages,
                settingsDataStore.model.first(),
                settingsDataStore.temperature.first()
            )
        ).execute()

        if (response.errorBody() != null) {
            throw HttpException(response)
        }

        response.body()?.byteStream()?.bufferedReader()?.use { reader ->
            val contents = mutableMapOf<Int, String>()

            while (currentCoroutineContext().isActive) {
                val line = reader.readLine() ?: continue
                if (line.isEmpty()) continue

                if (line == "data: [DONE]") break

                val lineResponse = gson.fromJson(
                    line.dropWhile { it != '{' }, // dropping "data: "
                    GenerateMessagesResponse::class.java
                )

                lineResponse.choices.firstOrNull()?.also { choice ->
                    choice.delta?.content?.takeIf { it.isNotEmpty() }?.also { content ->
                        var currentContent = contents[choice.index] ?: ""
                        currentContent += content

                        contents[choice.index] = currentContent

                        emit(choice.index to currentContent)
                    }
                }
            }
        }
    }.flowOn(Dispatchers.IO)
}