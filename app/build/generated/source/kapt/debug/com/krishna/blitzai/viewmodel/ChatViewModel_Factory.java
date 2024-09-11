package com.krishna.blitzai.viewmodel;

import android.app.Application;
import com.google.gson.Gson;
import com.krishna.blitzai.database.AppDatabase;
import com.krishna.blitzai.repository.network.OpenAIRepository;
import com.krishna.blitzai.viewmodel.base.BaseViewModel_MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata("com.krishna.blitzai.di.viewmodel.ChatId")
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
public final class ChatViewModel_Factory implements Factory<ChatViewModel> {
  private final Provider<Long> chatIdProvider;

  private final Provider<AppDatabase> databaseProvider;

  private final Provider<OpenAIRepository> openAIRepositoryProvider;

  private final Provider<Application> applicationProvider;

  private final Provider<Gson> gsonProvider;

  public ChatViewModel_Factory(Provider<Long> chatIdProvider,
      Provider<AppDatabase> databaseProvider, Provider<OpenAIRepository> openAIRepositoryProvider,
      Provider<Application> applicationProvider, Provider<Gson> gsonProvider) {
    this.chatIdProvider = chatIdProvider;
    this.databaseProvider = databaseProvider;
    this.openAIRepositoryProvider = openAIRepositoryProvider;
    this.applicationProvider = applicationProvider;
    this.gsonProvider = gsonProvider;
  }

  @Override
  public ChatViewModel get() {
    ChatViewModel instance = newInstance(chatIdProvider.get(), databaseProvider.get(), openAIRepositoryProvider.get(), applicationProvider.get());
    BaseViewModel_MembersInjector.injectGson(instance, gsonProvider.get());
    return instance;
  }

  public static ChatViewModel_Factory create(Provider<Long> chatIdProvider,
      Provider<AppDatabase> databaseProvider, Provider<OpenAIRepository> openAIRepositoryProvider,
      Provider<Application> applicationProvider, Provider<Gson> gsonProvider) {
    return new ChatViewModel_Factory(chatIdProvider, databaseProvider, openAIRepositoryProvider, applicationProvider, gsonProvider);
  }

  public static ChatViewModel newInstance(long chatId, AppDatabase database,
      OpenAIRepository openAIRepository, Application application) {
    return new ChatViewModel(chatId, database, openAIRepository, application);
  }
}
