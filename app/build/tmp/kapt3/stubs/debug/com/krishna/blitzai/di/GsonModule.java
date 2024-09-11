package com.krishna.blitzai.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\u0007\u00a8\u0006\u0006"}, d2 = {"Lcom/krishna/blitzai/di/GsonModule;", "", "()V", "provideGson", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class GsonModule {
    @org.jetbrains.annotations.NotNull
    public static final com.krishna.blitzai.di.GsonModule INSTANCE = null;
    
    private GsonModule() {
        super();
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    public final com.google.gson.Gson provideGson() {
        return null;
    }
}