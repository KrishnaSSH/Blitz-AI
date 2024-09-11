package com.krishna.blitzai.store.datastore;

@javax.inject.Singleton
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001b\u0010\u0011\u001a\u00020\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\u00122\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u001b\u0010\u0015\u001a\u00020\u00122\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017R\u0019\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lcom/krishna/blitzai/store/datastore/SettingsDataStore;", "Lcom/krishna/blitzai/store/datastore/base/BaseDataStore;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "apiKey", "Lkotlinx/coroutines/flow/Flow;", "", "getApiKey", "()Lkotlinx/coroutines/flow/Flow;", "endpoint", "getEndpoint", "model", "getModel", "temperature", "", "getTemperature", "saveApiKey", "Landroidx/datastore/preferences/core/Preferences;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveEndpoint", "saveModel", "saveTemperature", "(Ljava/lang/Float;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public final class SettingsDataStore extends com.krishna.blitzai.store.datastore.base.BaseDataStore {
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String DATA_STORE_NAME = "settings_data";
    @org.jetbrains.annotations.NotNull
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> ENDPOINT_KEY = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> API_KEY_KEY = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> MODEL_KEY = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.Float> TEMPERATURE_KEY = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.lang.String> endpoint = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.lang.String> apiKey = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.lang.String> model = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.lang.Float> temperature = null;
    @org.jetbrains.annotations.NotNull
    public static final com.krishna.blitzai.store.datastore.SettingsDataStore.Companion Companion = null;
    
    @javax.inject.Inject
    public SettingsDataStore(@dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.String> getEndpoint() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.String> getApiKey() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.String> getModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.Float> getTemperature() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object saveEndpoint(@org.jetbrains.annotations.Nullable
    java.lang.String endpoint, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super androidx.datastore.preferences.core.Preferences> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object saveApiKey(@org.jetbrains.annotations.Nullable
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super androidx.datastore.preferences.core.Preferences> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object saveModel(@org.jetbrains.annotations.Nullable
    java.lang.String model, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super androidx.datastore.preferences.core.Preferences> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object saveTemperature(@org.jetbrains.annotations.Nullable
    java.lang.Float temperature, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super androidx.datastore.preferences.core.Preferences> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007\u00a8\u0006\u0010"}, d2 = {"Lcom/krishna/blitzai/store/datastore/SettingsDataStore$Companion;", "", "()V", "API_KEY_KEY", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "getAPI_KEY_KEY", "()Landroidx/datastore/preferences/core/Preferences$Key;", "DATA_STORE_NAME", "ENDPOINT_KEY", "getENDPOINT_KEY", "MODEL_KEY", "getMODEL_KEY", "TEMPERATURE_KEY", "", "getTEMPERATURE_KEY", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> getENDPOINT_KEY() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> getAPI_KEY_KEY() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> getMODEL_KEY() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.datastore.preferences.core.Preferences.Key<java.lang.Float> getTEMPERATURE_KEY() {
            return null;
        }
    }
}