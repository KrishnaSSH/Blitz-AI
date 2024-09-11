package com.krishna.blitzai.di;

import com.krishna.blitzai.repository.network.interceptor.AuthenticationInterceptor;
import com.krishna.blitzai.repository.network.interceptor.ChangeEndpointInterceptor;
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
public final class OkHttpModule_ProvideOkHttpClientFactory implements Factory<OkHttpClient> {
  private final Provider<AuthenticationInterceptor> authenticationInterceptorProvider;

  private final Provider<ChangeEndpointInterceptor> changeEndpointInterceptorProvider;

  public OkHttpModule_ProvideOkHttpClientFactory(
      Provider<AuthenticationInterceptor> authenticationInterceptorProvider,
      Provider<ChangeEndpointInterceptor> changeEndpointInterceptorProvider) {
    this.authenticationInterceptorProvider = authenticationInterceptorProvider;
    this.changeEndpointInterceptorProvider = changeEndpointInterceptorProvider;
  }

  @Override
  public OkHttpClient get() {
    return provideOkHttpClient(authenticationInterceptorProvider.get(), changeEndpointInterceptorProvider.get());
  }

  public static OkHttpModule_ProvideOkHttpClientFactory create(
      Provider<AuthenticationInterceptor> authenticationInterceptorProvider,
      Provider<ChangeEndpointInterceptor> changeEndpointInterceptorProvider) {
    return new OkHttpModule_ProvideOkHttpClientFactory(authenticationInterceptorProvider, changeEndpointInterceptorProvider);
  }

  public static OkHttpClient provideOkHttpClient(
      AuthenticationInterceptor authenticationInterceptor,
      ChangeEndpointInterceptor changeEndpointInterceptor) {
    return Preconditions.checkNotNullFromProvides(OkHttpModule.INSTANCE.provideOkHttpClient(authenticationInterceptor, changeEndpointInterceptor));
  }
}
