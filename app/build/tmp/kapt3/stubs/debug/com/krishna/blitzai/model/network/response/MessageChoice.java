package com.krishna.blitzai.model.network.response;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J+\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lcom/krishna/blitzai/model/network/response/MessageChoice;", "", "message", "Lcom/krishna/blitzai/database/entity/ChatMessage;", "delta", "Lcom/krishna/blitzai/model/network/response/Delta;", "index", "", "(Lcom/krishna/blitzai/database/entity/ChatMessage;Lcom/krishna/blitzai/model/network/response/Delta;I)V", "getDelta", "()Lcom/krishna/blitzai/model/network/response/Delta;", "getIndex", "()I", "getMessage", "()Lcom/krishna/blitzai/database/entity/ChatMessage;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
@androidx.annotation.Keep
public final class MessageChoice {
    @com.google.gson.annotations.SerializedName(value = "message")
    @org.jetbrains.annotations.Nullable
    private final com.krishna.blitzai.database.entity.ChatMessage message = null;
    @com.google.gson.annotations.SerializedName(value = "delta")
    @org.jetbrains.annotations.Nullable
    private final com.krishna.blitzai.model.network.response.Delta delta = null;
    @com.google.gson.annotations.SerializedName(value = "index")
    private final int index = 0;
    
    public MessageChoice(@org.jetbrains.annotations.Nullable
    com.krishna.blitzai.database.entity.ChatMessage message, @org.jetbrains.annotations.Nullable
    com.krishna.blitzai.model.network.response.Delta delta, int index) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.krishna.blitzai.database.entity.ChatMessage getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.krishna.blitzai.model.network.response.Delta getDelta() {
        return null;
    }
    
    public final int getIndex() {
        return 0;
    }
    
    public MessageChoice() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.krishna.blitzai.database.entity.ChatMessage component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.krishna.blitzai.model.network.response.Delta component2() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.krishna.blitzai.model.network.response.MessageChoice copy(@org.jetbrains.annotations.Nullable
    com.krishna.blitzai.database.entity.ChatMessage message, @org.jetbrains.annotations.Nullable
    com.krishna.blitzai.model.network.response.Delta delta, int index) {
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