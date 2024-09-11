package com.krishna.blitzai.di;

import com.google.gson.Gson;
import com.krishna.blitzai.repository.network.service.OpenAIService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

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
public final class RetrofitModule_ProvideOpenAIServiceFactory implements Factory<OpenAIService> {
  private final Provider<OkHttpClient> clientProvider;

  private final Provider<Gson> gsonProvider;

  public RetrofitModule_ProvideOpenAIServiceFactory(Provider<OkHttpClient> clientProvider,
      Provider<Gson> gsonProvider) {
    this.clientProvider = clientProvider;
    this.gsonProvider = gsonProvider;
  }

  @Override
  public OpenAIService get() {
    return provideOpenAIService(clientProvider.get(), gsonProvider.get());
  }

  public static RetrofitModule_ProvideOpenAIServiceFactory create(
      Provider<OkHttpClient> clientProvider, Provider<Gson> gsonProvider) {
    return new RetrofitModule_ProvideOpenAIServiceFactory(clientProvider, gsonProvider);
  }

  public static OpenAIService provideOpenAIService(OkHttpClient client, Gson gson) {
    return Preconditions.checkNotNullFromProvides(RetrofitModule.INSTANCE.provideOpenAIService(client, gson));
  }
}
