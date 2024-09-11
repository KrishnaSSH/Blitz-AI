package com.krishna.blitzai.store.datastore.base;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J$\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00100\u000f\"\u0004\b\u0000\u0010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00100\u0012H\u0004J/\u0010\u0013\u001a\u00020\t\"\u0004\b\u0000\u0010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00100\u00122\b\u0010\u0014\u001a\u0004\u0018\u0001H\u0010H\u0084@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R%\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b*\u00020\u00038DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/krishna/blitzai/store/datastore/base/BaseDataStore;", "", "context", "Landroid/content/Context;", "dataStoreName", "", "(Landroid/content/Context;Ljava/lang/String;)V", "dataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "getDataStore", "(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", "dataStore$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getAsFlow", "Lkotlinx/coroutines/flow/Flow;", "T", "key", "Landroidx/datastore/preferences/core/Preferences$Key;", "save", "value", "(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract class BaseDataStore {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String dataStoreName = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.ReadOnlyProperty dataStore$delegate = null;
    
    public BaseDataStore(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String dataStoreName) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    protected final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> getDataStore(@org.jetbrains.annotations.NotNull
    android.content.Context $this$dataStore) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final <T extends java.lang.Object>kotlinx.coroutines.flow.Flow<T> getAsFlow(@org.jetbrains.annotations.NotNull
    androidx.datastore.preferences.core.Preferences.Key<T> key) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    protected final <T extends java.lang.Object>java.lang.Object save(@org.jetbrains.annotations.NotNull
    androidx.datastore.preferences.core.Preferences.Key<T> key, @org.jetbrains.annotations.Nullable
    T value, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super androidx.datastore.preferences.core.Preferences> $completion) {
        return null;
    }
}