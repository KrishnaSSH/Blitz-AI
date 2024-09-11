package com.krishna.blitzai.repository.network.interceptor

import com.krishna.blitzai.store.datastore.SettingsDataStore
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.runBlocking
import okhttp3.Interceptor
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AuthenticationInterceptor @Inject constructor(
    private val settingsDataStore: SettingsDataStore
): Interceptor {

    override fun intercept(chain: Interceptor.Chain) = runBlocking {
        chain.proceed(
            chain.request().newBuilder().addHeader(
                "Authorization",
                "Bearer ${settingsDataStore.apiKey.first()}"
            ).build()
        )
    }
}