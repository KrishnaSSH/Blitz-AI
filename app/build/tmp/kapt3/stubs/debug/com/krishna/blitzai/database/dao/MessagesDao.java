package com.krishna.blitzai.database.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J%\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\"\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0011\u0010\r\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J+\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00112\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\"\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001f\u0010\u0010\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0011\u0010\u0014\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/krishna/blitzai/database/dao/MessagesDao;", "", "countGeneratingMessagesInChat", "", "chatId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "", "messages", "", "Lcom/krishna/blitzai/database/entity/ChatMessage;", "([Lcom/krishna/blitzai/database/entity/ChatMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteEmptyMessages", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteEmptyMessagesInChat", "insert", "", "message", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markAllAsNotGenerating", "markAllAsNotGeneratingInChat", "app_debug"})
@androidx.room.Dao
public abstract interface MessagesDao {
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM ChatMessage WHERE generating = 1 AND chat_id = :chatId")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object countGeneratingMessagesInChat(long chatId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull
    com.krishna.blitzai.database.entity.ChatMessage[] message, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.Long>> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull
    java.util.List<com.krishna.blitzai.database.entity.ChatMessage> messages, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE ChatMessage SET generating = 0 WHERE generating = 1 AND chat_id = :chatId")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object markAllAsNotGeneratingInChat(long chatId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM ChatMessage WHERE content is NULL AND chat_id = :chatId")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteEmptyMessagesInChat(long chatId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE ChatMessage SET generating = 0 WHERE generating = 1")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object markAllAsNotGenerating(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM ChatMessage WHERE content is NULL")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteEmptyMessages(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull
    com.krishna.blitzai.database.entity.ChatMessage[] messages, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}