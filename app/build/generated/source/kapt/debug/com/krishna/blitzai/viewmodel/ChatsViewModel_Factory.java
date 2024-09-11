package com.krishna.blitzai.viewmodel;

import android.app.Application;
import com.google.gson.Gson;
import com.krishna.blitzai.database.AppDatabase;
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
public final class ChatsViewModel_Factory implements Factory<ChatsViewModel> {
  private final Provider<AppDatabase> databaseProvider;

  private final Provider<Application> applicationProvider;

  private final Provider<Gson> gsonProvider;

  public ChatsViewModel_Factory(Provider<AppDatabase> databaseProvider,
      Provider<Application> applicationProvider, Provider<Gson> gsonProvider) {
    this.databaseProvider = databaseProvider;
    this.applicationProvider = applicationProvider;
    this.gsonProvider = gsonProvider;
  }

  @Override
  public ChatsViewModel get() {
    ChatsViewModel instance = newInstance(databaseProvider.get(), applicationProvider.get());
    BaseViewModel_MembersInjector.injectGson(instance, gsonProvider.get());
    return instance;
  }

  public static ChatsViewModel_Factory create(Provider<AppDatabase> databaseProvider,
      Provider<Application> applicationProvider, Provider<Gson> gsonProvider) {
    return new ChatsViewModel_Factory(databaseProvider, applicationProvider, gsonProvider);
  }

  public static ChatsViewModel newInstance(AppDatabase database, Application application) {
    return new ChatsViewModel(database, application);
  }
}
