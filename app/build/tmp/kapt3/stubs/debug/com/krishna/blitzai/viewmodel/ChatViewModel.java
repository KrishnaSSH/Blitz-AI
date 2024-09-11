package com.krishna.blitzai.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%J\u000e\u0010&\u001a\u00020#2\u0006\u0010\u0016\u001a\u00020\u0018R+\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\u001b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b!\u0010\u0013\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u0006\'"}, d2 = {"Lcom/krishna/blitzai/viewmodel/ChatViewModel;", "Lcom/krishna/blitzai/viewmodel/base/BaseViewModel;", "chatId", "", "database", "Lcom/krishna/blitzai/database/AppDatabase;", "openAIRepository", "Lcom/krishna/blitzai/repository/network/OpenAIRepository;", "application", "Landroid/app/Application;", "(JLcom/krishna/blitzai/database/AppDatabase;Lcom/krishna/blitzai/repository/network/OpenAIRepository;Landroid/app/Application;)V", "<set-?>", "", "addingMyMessage", "getAddingMyMessage", "()Z", "setAddingMyMessage", "(Z)V", "addingMyMessage$delegate", "Landroidx/compose/runtime/MutableState;", "getChatId", "()J", "chatWithMessages", "Lkotlinx/coroutines/flow/Flow;", "Lcom/krishna/blitzai/database/entity/ChatWithMessages;", "getChatWithMessages", "()Lkotlinx/coroutines/flow/Flow;", "", "text", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "text$delegate", "delete", "Lkotlinx/coroutines/Job;", "message", "Lcom/krishna/blitzai/database/entity/ChatMessage;", "send", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class ChatViewModel extends com.krishna.blitzai.viewmodel.base.BaseViewModel {
    private final long chatId = 0L;
    @org.jetbrains.annotations.NotNull
    private final com.krishna.blitzai.database.AppDatabase database = null;
    @org.jetbrains.annotations.NotNull
    private final com.krishna.blitzai.repository.network.OpenAIRepository openAIRepository = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<com.krishna.blitzai.database.entity.ChatWithMessages> chatWithMessages = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState text$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState addingMyMessage$delegate = null;
    
    @javax.inject.Inject
    public ChatViewModel(@com.krishna.blitzai.di.viewmodel.ChatId
    long chatId, @org.jetbrains.annotations.NotNull
    com.krishna.blitzai.database.AppDatabase database, @org.jetbrains.annotations.NotNull
    com.krishna.blitzai.repository.network.OpenAIRepository openAIRepository, @org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super(null);
    }
    
    public final long getChatId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.krishna.blitzai.database.entity.ChatWithMessages> getChatWithMessages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getText() {
        return null;
    }
    
    public final void setText(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final boolean getAddingMyMessage() {
        return false;
    }
    
    public final void setAddingMyMessage(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job send(@org.jetbrains.annotations.NotNull
    com.krishna.blitzai.database.entity.ChatWithMessages chatWithMessages) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job delete(@org.jetbrains.annotations.NotNull
    com.krishna.blitzai.database.entity.ChatMessage message) {
        return null;
    }
}