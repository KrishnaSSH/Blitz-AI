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
public final class AuthenticationInterceptor_Factory implements Factory<AuthenticationInterceptor> {
  private final Provider<SettingsDataStore> settingsDataStoreProvider;

  public AuthenticationInterceptor_Factory(Provider<SettingsDataStore> settingsDataStoreProvider) {
    this.settingsDataStoreProvider = settingsDataStoreProvider;
  }

  @Override
  public AuthenticationInterceptor get() {
    return newInstance(settingsDataStoreProvider.get());
  }

  public static AuthenticationInterceptor_Factory create(
      Provider<SettingsDataStore> settingsDataStoreProvider) {
    return new AuthenticationInterceptor_Factory(settingsDataStoreProvider);
  }

  public static AuthenticationInterceptor newInstance(SettingsDataStore settingsDataStore) {
    return new AuthenticationInterceptor(settingsDataStore);
  }
}
