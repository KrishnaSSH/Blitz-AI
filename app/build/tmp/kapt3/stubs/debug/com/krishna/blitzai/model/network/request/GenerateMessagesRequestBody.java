package com.krishna.blitzai.model.network.request;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\bH\u00c6\u0003J\t\u0010\u0017\u001a\u00020\nH\u00c6\u0003J7\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0006H\u00d6\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001e"}, d2 = {"Lcom/krishna/blitzai/model/network/request/GenerateMessagesRequestBody;", "", "messages", "", "Lcom/krishna/blitzai/database/entity/ChatMessage;", "model", "", "temperature", "", "stream", "", "(Ljava/util/List;Ljava/lang/String;FZ)V", "getMessages", "()Ljava/util/List;", "getModel", "()Ljava/lang/String;", "getStream", "()Z", "getTemperature", "()F", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"})
@androidx.annotation.Keep
public final class GenerateMessagesRequestBody {
    @com.google.gson.annotations.SerializedName(value = "messages")
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.krishna.blitzai.database.entity.ChatMessage> messages = null;
    @com.google.gson.annotations.SerializedName(value = "model")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String model = null;
    @com.google.gson.annotations.SerializedName(value = "temperature")
    private final float temperature = 0.0F;
    @com.google.gson.annotations.SerializedName(value = "stream")
    private final boolean stream = false;
    
    public GenerateMessagesRequestBody(@org.jetbrains.annotations.NotNull
    java.util.List<com.krishna.blitzai.database.entity.ChatMessage> messages, @org.jetbrains.annotations.NotNull
    java.lang.String model, float temperature, boolean stream) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.krishna.blitzai.database.entity.ChatMessage> getMessages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getModel() {
        return null;
    }
    
    public final float getTemperature() {
        return 0.0F;
    }
    
    public final boolean getStream() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.krishna.blitzai.database.entity.ChatMessage> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    public final float component3() {
        return 0.0F;
    }
    
    public final boolean component4() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.krishna.blitzai.model.network.request.GenerateMessagesRequestBody copy(@org.jetbrains.annotations.NotNull
    java.util.List<com.krishna.blitzai.database.entity.ChatMessage> messages, @org.jetbrains.annotations.NotNull
    java.lang.String model, float temperature, boolean stream) {
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