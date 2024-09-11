package com.krishna.blitzai.repository.network;

@javax.inject.Singleton
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ;\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J1\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f0\u00180\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001e"}, d2 = {"Lcom/krishna/blitzai/repository/network/OpenAIRepository;", "Lcom/krishna/blitzai/repository/base/BaseRepository;", "openAIService", "Lcom/krishna/blitzai/repository/network/service/OpenAIService;", "settingsDataStore", "Lcom/krishna/blitzai/store/datastore/SettingsDataStore;", "gson", "Lcom/google/gson/Gson;", "(Lcom/krishna/blitzai/repository/network/service/OpenAIService;Lcom/krishna/blitzai/store/datastore/SettingsDataStore;Lcom/google/gson/Gson;)V", "generateAudio", "Lokhttp3/ResponseBody;", "model", "", "input", "voice", "format", "speed", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "generateImage", "prompt", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "generateMessagesStream", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Pair;", "", "messages", "", "Lcom/krishna/blitzai/database/entity/ChatMessage;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class OpenAIRepository extends com.krishna.blitzai.repository.base.BaseRepository {
    @org.jetbrains.annotations.NotNull
    private final com.krishna.blitzai.repository.network.service.OpenAIService openAIService = null;
    @org.jetbrains.annotations.NotNull
    private final com.krishna.blitzai.store.datastore.SettingsDataStore settingsDataStore = null;
    @org.jetbrains.annotations.NotNull
    private final com.google.gson.Gson gson = null;
    
    @javax.inject.Inject
    public OpenAIRepository(@org.jetbrains.annotations.NotNull
    com.krishna.blitzai.repository.network.service.OpenAIService openAIService, @org.jetbrains.annotations.NotNull
    com.krishna.blitzai.store.datastore.SettingsDataStore settingsDataStore, @org.jetbrains.annotations.NotNull
    com.google.gson.Gson gson) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object generateAudio(@org.jetbrains.annotations.NotNull
    java.lang.String model, @org.jetbrains.annotations.NotNull
    java.lang.String input, @org.jetbrains.annotations.NotNull
    java.lang.String voice, @org.jetbrains.annotations.NotNull
    java.lang.String format, float speed, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super okhttp3.ResponseBody> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object generateImage(@org.jetbrains.annotations.NotNull
    java.lang.String prompt, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object generateMessagesStream(@org.jetbrains.annotations.NotNull
    java.util.List<com.krishna.blitzai.database.entity.ChatMessage> messages, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<kotlin.Pair<java.lang.Integer, java.lang.String>>> $completion) {
        return null;
    }
}