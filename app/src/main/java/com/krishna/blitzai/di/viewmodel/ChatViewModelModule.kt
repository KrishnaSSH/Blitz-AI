package com.krishna.blitzai.di.viewmodel

import androidx.lifecycle.SavedStateHandle
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Qualifier

@Module
@InstallIn(ViewModelComponent::class)
object ChatViewModelModule {
    @Provides
    @ViewModelScoped
    @ChatId
    fun provideChatId(savedStateHandle: SavedStateHandle) = savedStateHandle.get<Long>("id")!!
}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class ChatId