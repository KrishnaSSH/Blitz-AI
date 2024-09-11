package com.krishna.blitzai.viewmodel;

import android.app.Application;
import com.google.gson.Gson;
import com.krishna.blitzai.store.datastore.SettingsDataStore;
import com.krishna.blitzai.viewmodel.base.BaseViewModel_MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class SettingsViewModel_Factory implements Factory<SettingsViewModel> {
  private final Provider<SettingsDataStore> settingsDataStoreProvider;

  private final Provider<Application> applicationProvider;

  private final Provider<Gson> gsonProvider;

  public SettingsViewModel_Factory(Provider<SettingsDataStore> settingsDataStoreProvider,
      Provider<Application> applicationProvider, Provider<Gson> gsonProvider) {
    this.settingsDataStoreProvider = settingsDataStoreProvider;
    this.applicationProvider = applicationProvider;
    this.gsonProvider = gsonProvider;
  }

  @Override
  public SettingsViewModel get() {
    SettingsViewModel instance = newInstance(settingsDataStoreProvider.get(), applicationProvider.get());
    BaseViewModel_MembersInjector.injectGson(instance, gsonProvider.get());
    return instance;
  }

  public static SettingsViewModel_Factory create(
      Provider<SettingsDataStore> settingsDataStoreProvider,
      Provider<Application> applicationProvider, Provider<Gson> gsonProvider) {
    return new SettingsViewModel_Factory(settingsDataStoreProvider, applicationProvider, gsonProvider);
  }

  public static SettingsViewModel newInstance(SettingsDataStore settingsDataStore,
      Application application) {
    return new SettingsViewModel(settingsDataStore, application);
  }
}
