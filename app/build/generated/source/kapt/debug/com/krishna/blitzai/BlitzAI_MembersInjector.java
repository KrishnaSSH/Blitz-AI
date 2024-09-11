package com.krishna.blitzai;

import com.krishna.blitzai.database.AppDatabase;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class BlitzAI_MembersInjector implements MembersInjector<BlitzAI> {
  private final Provider<AppDatabase> databaseProvider;

  public BlitzAI_MembersInjector(Provider<AppDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  public static MembersInjector<BlitzAI> create(Provider<AppDatabase> databaseProvider) {
    return new BlitzAI_MembersInjector(databaseProvider);
  }

  @Override
  public void injectMembers(BlitzAI instance) {
    injectDatabase(instance, databaseProvider.get());
  }

  @InjectedFieldSignature("com.krishna.blitzai.BlitzAI.database")
  public static void injectDatabase(BlitzAI instance, AppDatabase database) {
    instance.database = database;
  }
}
