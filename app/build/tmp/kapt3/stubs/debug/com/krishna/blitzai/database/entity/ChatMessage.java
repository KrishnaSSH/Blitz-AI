package com.krishna.blitzai.database.entity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u000bJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\t\u0010$\u001a\u00020\u0007H\u00c6\u0003JP\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010&J\u0013\u0010\'\u001a\u00020\u00052\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010)\u001a\u00020\u001aH\u00d6\u0001J\t\u0010*\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0016\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u001a8F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018\u00a8\u0006+"}, d2 = {"Lcom/krishna/blitzai/database/entity/ChatMessage;", "", "content", "", "generating", "", "time", "", "role", "chatId", "id", "(Ljava/lang/String;ZJLjava/lang/String;Ljava/lang/Long;J)V", "getChatId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getContent", "()Ljava/lang/String;", "fromBlitz", "getFromBlitz", "()Z", "fromUser", "getFromUser", "getGenerating", "getId", "()J", "parsedRole", "", "getParsedRole", "()I", "getRole", "getTime", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;ZJLjava/lang/String;Ljava/lang/Long;J)Lcom/krishna/blitzai/database/entity/ChatMessage;", "equals", "other", "hashCode", "toString", "app_debug"})
@androidx.annotation.Keep
@androidx.room.Entity(foreignKeys = {@androidx.room.ForeignKey(entity = com.krishna.blitzai.database.entity.Chat.class, parentColumns = {"id"}, childColumns = {"chat_id"}, onDelete = 5)})
public final class ChatMessage {
    @androidx.room.ColumnInfo(name = "content")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String content = null;
    @com.krishna.blitzai.di.GsonSkip
    @androidx.room.ColumnInfo(name = "generating")
    private final boolean generating = false;
    @com.krishna.blitzai.di.GsonSkip
    @androidx.room.ColumnInfo(name = "time")
    private final long time = 0L;
    @androidx.room.ColumnInfo(name = "role")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String role = null;
    @com.krishna.blitzai.di.GsonSkip
    @androidx.room.ColumnInfo(name = "chat_id", index = true)
    @org.jetbrains.annotations.Nullable
    private final java.lang.Long chatId = null;
    @com.krishna.blitzai.di.GsonSkip
    @androidx.room.ColumnInfo(name = "message_id")
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final long id = 0L;
    
    public ChatMessage(@org.jetbrains.annotations.Nullable
    java.lang.String content, boolean generating, long time, @org.jetbrains.annotations.Nullable
    java.lang.String role, @org.jetbrains.annotations.Nullable
    java.lang.Long chatId, long id) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getContent() {
        return null;
    }
    
    public final boolean getGenerating() {
        return false;
    }
    
    public final long getTime() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getRole() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getChatId() {
        return null;
    }
    
    public final long getId() {
        return 0L;
    }
    
    public final boolean getFromUser() {
        return false;
    }
    
    public final boolean getFromBlitz() {
        return false;
    }
    
    public final int getParsedRole() {
        return 0;
    }
    
    public ChatMessage() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component1() {
        return null;
    }
    
    public final boolean component2() {
        return false;
    }
    
    public final long component3() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long component5() {
        return null;
    }
    
    public final long component6() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.krishna.blitzai.database.entity.ChatMessage copy(@org.jetbrains.annotations.Nullable
    java.lang.String content, boolean generating, long time, @org.jetbrains.annotations.Nullable
    java.lang.String role, @org.jetbrains.annotations.Nullable
    java.lang.Long chatId, long id) {
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