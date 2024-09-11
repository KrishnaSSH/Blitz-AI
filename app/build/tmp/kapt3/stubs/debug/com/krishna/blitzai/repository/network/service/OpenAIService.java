package com.krishna.blitzai.repository.network.service;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u001b\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0005\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\b\b\u0001\u0010\u0005\u001a\u00020\u000eH\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/krishna/blitzai/repository/network/service/OpenAIService;", "", "generateAudio", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "body", "Lcom/krishna/blitzai/model/network/request/GenerateAudioRequestBody;", "(Lcom/krishna/blitzai/model/network/request/GenerateAudioRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "generateImage", "Lcom/krishna/blitzai/model/network/response/GenerateImageResponse;", "Lcom/krishna/blitzai/model/network/request/GenerateImageRequestBody;", "(Lcom/krishna/blitzai/model/network/request/GenerateImageRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "generateMessagesStream", "Lretrofit2/Call;", "Lcom/krishna/blitzai/model/network/request/GenerateMessagesRequestBody;", "app_debug"})
public abstract interface OpenAIService {
    
    @retrofit2.http.POST(value = "chat/completions")
    @retrofit2.http.Streaming
    @org.jetbrains.annotations.NotNull
    public abstract retrofit2.Call<okhttp3.ResponseBody> generateMessagesStream(@retrofit2.http.Body
    @org.jetbrains.annotations.NotNull
    com.krishna.blitzai.model.network.request.GenerateMessagesRequestBody body);
    
    @retrofit2.http.POST(value = "images/generations")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object generateImage(@retrofit2.http.Body
    @org.jetbrains.annotations.NotNull
    com.krishna.blitzai.model.network.request.GenerateImageRequestBody body, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.krishna.blitzai.model.network.response.GenerateImageResponse> $completion);
    
    @retrofit2.http.POST(value = "audio/speech")
    @retrofit2.http.Streaming
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object generateAudio(@retrofit2.http.Body
    @org.jetbrains.annotations.NotNull
    com.krishna.blitzai.model.network.request.GenerateAudioRequestBody body, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion);
}