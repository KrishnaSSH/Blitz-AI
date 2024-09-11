package com.krishna.blitzai.model.network.request;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\bH\u00c6\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b\u00a8\u0006\u001d"}, d2 = {"Lcom/krishna/blitzai/model/network/request/GenerateAudioRequestBody;", "", "model", "", "input", "voice", "responseFormat", "speed", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;F)V", "getInput", "()Ljava/lang/String;", "getModel", "getResponseFormat", "getSpeed", "()F", "getVoice", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
@androidx.annotation.Keep
public final class GenerateAudioRequestBody {
    @com.google.gson.annotations.SerializedName(value = "model")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String model = null;
    @com.google.gson.annotations.SerializedName(value = "input")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String input = null;
    @com.google.gson.annotations.SerializedName(value = "voice")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String voice = null;
    @com.google.gson.annotations.SerializedName(value = "response_format")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String responseFormat = null;
    @com.google.gson.annotations.SerializedName(value = "speed")
    private final float speed = 0.0F;
    
    public GenerateAudioRequestBody(@org.jetbrains.annotations.NotNull
    java.lang.String model, @org.jetbrains.annotations.NotNull
    java.lang.String input, @org.jetbrains.annotations.NotNull
    java.lang.String voice, @org.jetbrains.annotations.NotNull
    java.lang.String responseFormat, float speed) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getInput() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getVoice() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getResponseFormat() {
        return null;
    }
    
    public final float getSpeed() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    public final float component5() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.krishna.blitzai.model.network.request.GenerateAudioRequestBody copy(@org.jetbrains.annotations.NotNull
    java.lang.String model, @org.jetbrains.annotations.NotNull
    java.lang.String input, @org.jetbrains.annotations.NotNull
    java.lang.String voice, @org.jetbrains.annotations.NotNull
    java.lang.String responseFormat, float speed) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}