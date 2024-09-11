package com.krishna.blitzai.repository.network;

import com.google.gson.Gson;
import com.krishna.blitzai.repository.network.service.OpenAIService;
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
public final class OpenAIRepository_Factory implements Factory<OpenAIRepository> {
  private final Provider<OpenAIService> openAIServiceProvider;

  private final Provider<SettingsDataStore> settingsDataStoreProvider;

  private final Provider<Gson> gsonProvider;

  public OpenAIRepository_Factory(Provider<OpenAIService> openAIServiceProvider,
      Provider<SettingsDataStore> settingsDataStoreProvider, Provider<Gson> gsonProvider) {
    this.openAIServiceProvider = openAIServiceProvider;
    this.settingsDataStoreProvider = settingsDataStoreProvider;
    this.gsonProvider = gsonProvider;
  }

  @Override
  public OpenAIRepository get() {
    return newInstance(openAIServiceProvider.get(), settingsDataStoreProvider.get(), gsonProvider.get());
  }

  public static OpenAIRepository_Factory create(Provider<OpenAIService> openAIServiceProvider,
      Provider<SettingsDataStore> settingsDataStoreProvider, Provider<Gson> gsonProvider) {
    return new OpenAIRepository_Factory(openAIServiceProvider, settingsDataStoreProvider, gsonProvider);
  }

  public static OpenAIRepository newInstance(OpenAIService openAIService,
      SettingsDataStore settingsDataStore, Gson gson) {
    return new OpenAIRepository(openAIService, settingsDataStore, gson);
  }
}
