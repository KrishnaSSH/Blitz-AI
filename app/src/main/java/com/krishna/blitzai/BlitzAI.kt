package com.krishna.blitzai

import android.app.Application
import com.krishna.blitzai.database.AppDatabase
import dagger.hilt.android.HiltAndroidApp
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltAndroidApp
class BlitzAI: Application() {

    companion object {
        const val API_ENDPOINT = "api.groq.com/openai/v1"

        val applicationScope = MainScope()
    }

    @Inject
    lateinit var database: AppDatabase

    override fun onCreate() {
        super.onCreate()

        applicationScope.launch(Dispatchers.IO) {
            database.messagesDao().apply {
                markAllAsNotGenerating()
                deleteEmptyMessages()
            }
        }
    }
}