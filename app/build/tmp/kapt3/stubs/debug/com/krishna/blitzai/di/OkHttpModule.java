package com.krishna.blitzai.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lcom/krishna/blitzai/di/OkHttpModule;", "", "()V", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "authenticationInterceptor", "Lcom/krishna/blitzai/repository/network/interceptor/AuthenticationInterceptor;", "changeEndpointInterceptor", "Lcom/krishna/blitzai/repository/network/interceptor/ChangeEndpointInterceptor;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class OkHttpModule {
    @org.jetbrains.annotations.NotNull
    public static final com.krishna.blitzai.di.OkHttpModule INSTANCE = null;
    
    private OkHttpModule() {
        super();
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final okhttp3.OkHttpClient provideOkHttpClient(@org.jetbrains.annotations.NotNull
    com.krishna.blitzai.repository.network.interceptor.AuthenticationInterceptor authenticationInterceptor, @org.jetbrains.annotations.NotNull
    com.krishna.blitzai.repository.network.interceptor.ChangeEndpointInterceptor changeEndpointInterceptor) {
        return null;
    }
}