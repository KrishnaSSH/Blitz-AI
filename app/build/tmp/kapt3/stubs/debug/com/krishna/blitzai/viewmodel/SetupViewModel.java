package com.krishna.blitzai.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0010\u001a\u00020\u0011R+\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/krishna/blitzai/viewmodel/SetupViewModel;", "Lcom/krishna/blitzai/viewmodel/base/BaseViewModel;", "settingsDataStore", "Lcom/krishna/blitzai/store/datastore/SettingsDataStore;", "application", "Landroid/app/Application;", "(Lcom/krishna/blitzai/store/datastore/SettingsDataStore;Landroid/app/Application;)V", "<set-?>", "", "apiKey", "getApiKey", "()Ljava/lang/String;", "setApiKey", "(Ljava/lang/String;)V", "apiKey$delegate", "Landroidx/compose/runtime/MutableState;", "saveApiKey", "Lkotlinx/coroutines/Job;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class SetupViewModel extends com.krishna.blitzai.viewmodel.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.krishna.blitzai.store.datastore.SettingsDataStore settingsDataStore = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState apiKey$delegate = null;
    
    @javax.inject.Inject
    public SetupViewModel(@org.jetbrains.annotations.NotNull
    com.krishna.blitzai.store.datastore.SettingsDataStore settingsDataStore, @org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getApiKey() {
        return null;
    }
    
    public final void setApiKey(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job saveApiKey() {
        return null;
    }
}