package com.krishna.blitzai.repository.network.interceptor;

@javax.inject.Singleton
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/krishna/blitzai/repository/network/interceptor/AuthenticationInterceptor;", "Lokhttp3/Interceptor;", "settingsDataStore", "Lcom/krishna/blitzai/store/datastore/SettingsDataStore;", "(Lcom/krishna/blitzai/store/datastore/SettingsDataStore;)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "app_debug"})
public final class AuthenticationInterceptor implements okhttp3.Interceptor {
    @org.jetbrains.annotations.NotNull
    private final com.krishna.blitzai.store.datastore.SettingsDataStore settingsDataStore = null;
    
    @javax.inject.Inject
    public AuthenticationInterceptor(@org.jetbrains.annotations.NotNull
    com.krishna.blitzai.store.datastore.SettingsDataStore settingsDataStore) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull
    okhttp3.Interceptor.Chain chain) {
        return null;
    }
}