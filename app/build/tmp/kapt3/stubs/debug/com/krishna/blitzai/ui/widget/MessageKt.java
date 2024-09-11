package com.krishna.blitzai.ui.widget;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0003\u001aT\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2(\u0010\r\u001a$\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u000e\u00a2\u0006\u0002\b\u0011\u00a2\u0006\u0002\b\u0012H\u0003\u001a*\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\fH\u0007\u001a\u0018\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\bH\u0003\u001a\u0012\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\nH\u0007\u001a\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\u001c\u0010\u0019\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\n\u00a8\u0006\u001b"}, d2 = {"ActionChip", "", "messageAction", "Lcom/krishna/blitzai/ui/widget/MessageAction;", "onDismiss", "Lkotlin/Function0;", "BaseMessage", "message", "Lcom/krishna/blitzai/database/entity/ChatMessage;", "needTitle", "", "actions", "", "content", "Lkotlin/Function3;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "Message", "MessageText", "modifier", "TypingMessage", "messageCornerShape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "messageBubble", "picture", "app_debug"})
public final class MessageKt {
    
    @androidx.compose.runtime.Composable
    public static final void Message(@org.jetbrains.annotations.NotNull
    com.krishna.blitzai.database.entity.ChatMessage message, boolean needTitle, @org.jetbrains.annotations.NotNull
    java.util.List<com.krishna.blitzai.ui.widget.MessageAction> actions) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void MessageText(androidx.compose.ui.Modifier modifier, com.krishna.blitzai.database.entity.ChatMessage message) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void TypingMessage(boolean needTitle) {
    }
    
    @kotlin.OptIn(markerClass = {androidx.compose.foundation.layout.ExperimentalLayoutApi.class})
    @androidx.compose.runtime.Composable
    private static final void BaseMessage(com.krishna.blitzai.database.entity.ChatMessage message, boolean needTitle, java.util.List<com.krishna.blitzai.ui.widget.MessageAction> actions, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.ui.Modifier, ? super java.lang.Boolean, kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void ActionChip(com.krishna.blitzai.ui.widget.MessageAction messageAction, kotlin.jvm.functions.Function0<kotlin.Unit> onDismiss) {
    }
    
    @org.jetbrains.annotations.NotNull
    public static final androidx.compose.ui.Modifier messageBubble(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier $this$messageBubble, @org.jetbrains.annotations.NotNull
    com.krishna.blitzai.database.entity.ChatMessage message, boolean picture) {
        return null;
    }
    
    private static final androidx.compose.foundation.shape.RoundedCornerShape messageCornerShape(com.krishna.blitzai.database.entity.ChatMessage message) {
        return null;
    }
}