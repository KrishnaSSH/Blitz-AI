package com.krishna.blitzai.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010J\u000e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0011R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/krishna/blitzai/viewmodel/ChatsViewModel;", "Lcom/krishna/blitzai/viewmodel/base/BaseViewModel;", "database", "Lcom/krishna/blitzai/database/AppDatabase;", "application", "Landroid/app/Application;", "(Lcom/krishna/blitzai/database/AppDatabase;Landroid/app/Application;)V", "chatsWithMessages", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/krishna/blitzai/database/entity/ChatWithMessages;", "getChatsWithMessages", "()Lkotlinx/coroutines/flow/Flow;", "createChat", "Lkotlinx/coroutines/Job;", "onCreated", "Lkotlin/Function1;", "Lcom/krishna/blitzai/database/entity/Chat;", "", "deleteChat", "chat", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class ChatsViewModel extends com.krishna.blitzai.viewmodel.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.krishna.blitzai.database.AppDatabase database = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.krishna.blitzai.database.entity.ChatWithMessages>> chatsWithMessages = null;
    
    @javax.inject.Inject
    public ChatsViewModel(@org.jetbrains.annotations.NotNull
    com.krishna.blitzai.database.AppDatabase database, @org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.krishna.blitzai.database.entity.ChatWithMessages>> getChatsWithMessages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job createChat(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.krishna.blitzai.database.entity.Chat, kotlin.Unit> onCreated) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job deleteChat(@org.jetbrains.annotations.NotNull
    com.krishna.blitzai.database.entity.Chat chat) {
        return null;
    }
}