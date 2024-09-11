package com.krishna.blitzai.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/krishna/blitzai/viewmodel/MainViewModel;", "Lcom/krishna/blitzai/viewmodel/base/BaseViewModel;", "settingsDataStore", "Lcom/krishna/blitzai/store/datastore/SettingsDataStore;", "application", "Landroid/app/Application;", "(Lcom/krishna/blitzai/store/datastore/SettingsDataStore;Landroid/app/Application;)V", "shouldOpenSetup", "Lkotlinx/coroutines/flow/Flow;", "", "getShouldOpenSetup", "()Lkotlinx/coroutines/flow/Flow;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class MainViewModel extends com.krishna.blitzai.viewmodel.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.krishna.blitzai.store.datastore.SettingsDataStore settingsDataStore = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> shouldOpenSetup = null;
    
    @javax.inject.Inject
    public MainViewModel(@org.jetbrains.annotations.NotNull
    com.krishna.blitzai.store.datastore.SettingsDataStore settingsDataStore, @org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> getShouldOpenSetup() {
        return null;
    }
}