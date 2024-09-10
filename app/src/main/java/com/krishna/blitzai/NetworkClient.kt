package com.krishna.blitzai.network

import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor

object NetworkClient {
    private val client = OkHttpClient.Builder()
        .addInterceptor(HttpLoggingInterceptor().apply {
            var level = HttpLoggingInterceptor.Level.BODY
        })
        .build()

    fun postRequest(apiKey: String, userInput: String): String? {
        val requestBody = """
        {
            "messages": [{"role": "user", "content": "$userInput"}],
            "model": "llama3-8b-8192"
        }
    """.trimIndent().toRequestBody()

        val request = Request.Builder()
            .url("https://api.groq.com/openai/v1/chat/completions")
            .addHeader("Authorization", "Bearer $apiKey")
            .addHeader("Content-Type", "application/json")
            .post(requestBody)
            .build()

        return try {
            client.newCall(request).execute().use { response: Response ->
                if (response.isSuccessful) {
                    response.body?.string().also { println("Response: $it") } // Log response
                } else {
                    "Error: ${response.message}".also { println("Error: ${response.message}") }
                }
            }
        } catch (e: Exception) {
            "Exception: ${e.message}".also { println("Exception: ${e.message}") }
        }
    }

}

