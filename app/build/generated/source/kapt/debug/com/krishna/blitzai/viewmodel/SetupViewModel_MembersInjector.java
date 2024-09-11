package com.krishna.blitzai.viewmodel;

import com.google.gson.Gson;
import com.krishna.blitzai.viewmodel.base.BaseViewModel_MembersInjector;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
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
public final class SetupViewModel_MembersInjector implements MembersInjector<SetupViewModel> {
  private final Provider<Gson> gsonProvider;

  public SetupViewModel_MembersInjector(Provider<Gson> gsonProvider) {
    this.gsonProvider = gsonProvider;
  }

  public static MembersInjector<SetupViewModel> create(Provider<Gson> gsonProvider) {
    return new SetupViewModel_MembersInjector(gsonProvider);
  }

  @Override
  public void injectMembers(SetupViewModel instance) {
    BaseViewModel_MembersInjector.injectGson(instance, gsonProvider.get());
  }
}
