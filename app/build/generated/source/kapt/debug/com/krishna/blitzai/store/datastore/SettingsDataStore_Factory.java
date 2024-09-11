package com.krishna.blitzai.store.datastore;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class SettingsDataStore_Factory implements Factory<SettingsDataStore> {
  private final Provider<Context> contextProvider;

  public SettingsDataStore_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public SettingsDataStore get() {
    return newInstance(contextProvider.get());
  }

  public static SettingsDataStore_Factory create(Provider<Context> contextProvider) {
    return new SettingsDataStore_Factory(contextProvider);
  }

  public static SettingsDataStore newInstance(Context context) {
    return new SettingsDataStore(context);
  }
}
