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
public final class AudioDataStore_Factory implements Factory<AudioDataStore> {
  private final Provider<Context> contextProvider;

  public AudioDataStore_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public AudioDataStore get() {
    return newInstance(contextProvider.get());
  }

  public static AudioDataStore_Factory create(Provider<Context> contextProvider) {
    return new AudioDataStore_Factory(contextProvider);
  }

  public static AudioDataStore newInstance(Context context) {
    return new AudioDataStore(context);
  }
}
