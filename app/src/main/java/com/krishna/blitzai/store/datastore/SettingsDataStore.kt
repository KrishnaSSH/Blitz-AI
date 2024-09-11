package com.krishna.blitzai.store.datastore

import android.content.Context
import androidx.datastore.preferences.core.floatPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import com.krishna.blitzai.BlitzAI
import com.krishna.blitzai.store.datastore.base.BaseDataStore
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SettingsDataStore @Inject constructor(
    @ApplicationContext context: Context
): BaseDataStore(context, DATA_STORE_NAME) {

    companion object {
        const val DATA_STORE_NAME = "settings_data"

        val ENDPOINT_KEY = stringPreferencesKey("endpoint")
        val API_KEY_KEY = stringPreferencesKey("api_key")
        val MODEL_KEY = stringPreferencesKey("model")
        val TEMPERATURE_KEY = floatPreferencesKey("temperature")
    }

    val endpoint = getAsFlow(ENDPOINT_KEY).map {
        it ?: BlitzAI.API_ENDPOINT
    }
    val apiKey = getAsFlow(API_KEY_KEY)
    val model = getAsFlow(MODEL_KEY).map {
        it ?: "mixtral-8x7b-32768"
    }
    val temperature = getAsFlow(TEMPERATURE_KEY).map {
        it ?: 1f
    }

    suspend fun saveEndpoint(endpoint: String?) = save(ENDPOINT_KEY, endpoint)
    suspend fun saveApiKey(apiKey: String?) = save(API_KEY_KEY, apiKey)
    suspend fun saveModel(model: String?) = save(MODEL_KEY, model)
    suspend fun saveTemperature(temperature: Float?) = save(TEMPERATURE_KEY, temperature)
}