package com.krishna.blitzai.viewmodel.base;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0017\u001a\u00020\u00182\n\u0010\u0019\u001a\u00060\u001aj\u0002`\u001bH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ=\u0010\u001d\u001a\u00020\u001e*\u00020\u001f2\'\u0010 \u001a#\b\u0001\u0012\u0004\u0012\u00020\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\"\u0012\u0006\u0012\u0004\u0018\u00010#0!\u00a2\u0006\u0002\b$H\u0004\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%Jf\u0010\u001d\u001a\u00020\u001e*\u00020\u001f2\'\u0010 \u001a#\b\u0001\u0012\u0004\u0012\u00020\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\"\u0012\u0006\u0012\u0004\u0018\u00010#0!\u00a2\u0006\u0002\b$2\'\u0010&\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\"\u0012\u0006\u0012\u0004\u0018\u00010#0!\u00a2\u0006\u0002\b$H\u0004\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'R\u0014\u0010\u0005\u001a\u00020\u00038DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R/\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006("}, d2 = {"Lcom/krishna/blitzai/viewmodel/base/BaseViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "ctx", "getCtx", "()Landroid/app/Application;", "<set-?>", "", "error", "getError", "()Ljava/lang/String;", "setError", "(Ljava/lang/String;)V", "error$delegate", "Landroidx/compose/runtime/MutableState;", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "setGson", "(Lcom/google/gson/Gson;)V", "handleNetworkError", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onIO", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "errorBlock", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "app_debug"})
public abstract class BaseViewModel extends androidx.lifecycle.AndroidViewModel {
    @javax.inject.Inject
    public com.google.gson.Gson gson;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState error$delegate = null;
    
    public BaseViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.gson.Gson getGson() {
        return null;
    }
    
    public final void setGson(@org.jetbrains.annotations.NotNull
    com.google.gson.Gson p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getError() {
        return null;
    }
    
    public final void setError(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    protected final android.app.Application getCtx() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final kotlinx.coroutines.Job onIO(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineScope $this$onIO, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final kotlinx.coroutines.Job onIO(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineScope $this$onIO, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> errorBlock) {
        return null;
    }
    
    private final java.lang.Object handleNetworkError(java.lang.Exception e, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}