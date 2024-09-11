package com.krishna.blitzai.di;

import android.content.Context;
import com.krishna.blitzai.database.AppDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class RoomModule_ProvideRoomDatabaseFactory implements Factory<AppDatabase> {
  private final Provider<Context> contextProvider;

  public RoomModule_ProvideRoomDatabaseFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public AppDatabase get() {
    return provideRoomDatabase(contextProvider.get());
  }

  public static RoomModule_ProvideRoomDatabaseFactory create(Provider<Context> contextProvider) {
    return new RoomModule_ProvideRoomDatabaseFactory(contextProvider);
  }

  public static AppDatabase provideRoomDatabase(Context context) {
    return Preconditions.checkNotNullFromProvides(RoomModule.INSTANCE.provideRoomDatabase(context));
  }
}
