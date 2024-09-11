package com.krishna.blitzai;

@dagger.hilt.android.HiltAndroidApp
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/krishna/blitzai/BlitzAI;", "Landroid/app/Application;", "()V", "database", "Lcom/krishna/blitzai/database/AppDatabase;", "getDatabase", "()Lcom/krishna/blitzai/database/AppDatabase;", "setDatabase", "(Lcom/krishna/blitzai/database/AppDatabase;)V", "onCreate", "", "Companion", "app_debug"})
public final class BlitzAI extends android.app.Application {
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String API_ENDPOINT = "api.groq.com/openai/v1";
    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.CoroutineScope applicationScope = null;
    @javax.inject.Inject
    public com.krishna.blitzai.database.AppDatabase database;
    @org.jetbrains.annotations.NotNull
    public static final com.krishna.blitzai.BlitzAI.Companion Companion = null;
    
    public BlitzAI() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.krishna.blitzai.database.AppDatabase getDatabase() {
        return null;
    }
    
    public final void setDatabase(@org.jetbrains.annotations.NotNull
    com.krishna.blitzai.database.AppDatabase p0) {
    }
    
    @java.lang.Override
    public void onCreate() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/krishna/blitzai/BlitzAI$Companion;", "", "()V", "API_ENDPOINT", "", "applicationScope", "Lkotlinx/coroutines/CoroutineScope;", "getApplicationScope", "()Lkotlinx/coroutines/CoroutineScope;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final kotlinx.coroutines.CoroutineScope getApplicationScope() {
            return null;
        }
    }
}