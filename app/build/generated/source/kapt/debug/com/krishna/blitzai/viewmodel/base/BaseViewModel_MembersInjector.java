package com.krishna.blitzai.viewmodel.base;

import com.google.gson.Gson;
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
public final class BaseViewModel_MembersInjector implements MembersInjector<BaseViewModel> {
  private final Provider<Gson> gsonProvider;

  public BaseViewModel_MembersInjector(Provider<Gson> gsonProvider) {
    this.gsonProvider = gsonProvider;
  }

  public static MembersInjector<BaseViewModel> create(Provider<Gson> gsonProvider) {
    return new BaseViewModel_MembersInjector(gsonProvider);
  }

  @Override
  public void injectMembers(BaseViewModel instance) {
    injectGson(instance, gsonProvider.get());
  }

  @InjectedFieldSignature("com.krishna.blitzai.viewmodel.base.BaseViewModel.gson")
  public static void injectGson(BaseViewModel instance, Gson gson) {
    instance.gson = gson;
  }
}
