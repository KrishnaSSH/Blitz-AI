package com.krishna.blitzai.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006\n"}, d2 = {"Lcom/krishna/blitzai/di/RetrofitModule;", "", "()V", "provideOpenAIService", "Lcom/krishna/blitzai/repository/network/service/OpenAIService;", "kotlin.jvm.PlatformType", "client", "Lokhttp3/OkHttpClient;", "gson", "Lcom/google/gson/Gson;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class RetrofitModule {
    @org.jetbrains.annotations.NotNull
    public static final com.krishna.blitzai.di.RetrofitModule INSTANCE = null;
    
    private RetrofitModule() {
        super();
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    public final com.krishna.blitzai.repository.network.service.OpenAIService provideOpenAIService(@org.jetbrains.annotations.NotNull
    okhttp3.OkHttpClient client, @org.jetbrains.annotations.NotNull
    com.google.gson.Gson gson) {
        return null;
    }
}