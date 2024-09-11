package com.krishna.blitzai.database.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\'J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\f\u001a\u00020\rH\'J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/krishna/blitzai/database/dao/ChatsDao;", "", "delete", "", "chat", "Lcom/krishna/blitzai/database/entity/Chat;", "(Lcom/krishna/blitzai/database/entity/Chat;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAll", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/krishna/blitzai/database/entity/ChatWithMessages;", "getById", "id", "", "insert", "app_debug"})
@androidx.room.Dao
public abstract interface ChatsDao {
    
    @androidx.room.Transaction
    @androidx.room.Query(value = "SELECT * FROM Chat")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.krishna.blitzai.database.entity.ChatWithMessages>> getAll();
    
    @androidx.room.Transaction
    @androidx.room.Query(value = "SELECT * FROM Chat WHERE id = :id")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<com.krishna.blitzai.database.entity.ChatWithMessages> getById(long id);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull
    com.krishna.blitzai.database.entity.Chat chat, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @androidx.room.Delete
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull
    com.krishna.blitzai.database.entity.Chat chat, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}