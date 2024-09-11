package com.krishna.blitzai.repository.network.interceptor;

import com.krishna.blitzai.store.datastore.SettingsDataStore;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class ChangeEndpointInterceptor_Factory implements Factory<ChangeEndpointInterceptor> {
  private final Provider<SettingsDataStore> settingsDataStoreProvider;

  public ChangeEndpointInterceptor_Factory(Provider<SettingsDataStore> settingsDataStoreProvider) {
    this.settingsDataStoreProvider = settingsDataStoreProvider;
  }

  @Override
  public ChangeEndpointInterceptor get() {
    return newInstance(settingsDataStoreProvider.get());
  }

  public static ChangeEndpointInterceptor_Factory create(
      Provider<SettingsDataStore> settingsDataStoreProvider) {
    return new ChangeEndpointInterceptor_Factory(settingsDataStoreProvider);
  }

  public static ChangeEndpointInterceptor newInstance(SettingsDataStore settingsDataStore) {
    return new ChangeEndpointInterceptor(settingsDataStore);
  }
}
