package com.krishna.blitzai.di.viewmodel;

import androidx.lifecycle.SavedStateHandle;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("dagger.hilt.android.scopes.ViewModelScoped")
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
public final class ChatViewModelModule_ProvideChatIdFactory implements Factory<Long> {
  private final Provider<SavedStateHandle> savedStateHandleProvider;

  public ChatViewModelModule_ProvideChatIdFactory(
      Provider<SavedStateHandle> savedStateHandleProvider) {
    this.savedStateHandleProvider = savedStateHandleProvider;
  }

  @Override
  public Long get() {
    return provideChatId(savedStateHandleProvider.get());
  }

  public static ChatViewModelModule_ProvideChatIdFactory create(
      Provider<SavedStateHandle> savedStateHandleProvider) {
    return new ChatViewModelModule_ProvideChatIdFactory(savedStateHandleProvider);
  }

  public static long provideChatId(SavedStateHandle savedStateHandle) {
    return ChatViewModelModule.INSTANCE.provideChatId(savedStateHandle);
  }
}
