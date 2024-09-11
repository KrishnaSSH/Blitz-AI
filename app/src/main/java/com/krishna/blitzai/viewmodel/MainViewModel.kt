package com.krishna.blitzai.viewmodel

import android.app.Application
import com.krishna.blitzai.store.datastore.SettingsDataStore
import com.krishna.blitzai.viewmodel.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val settingsDataStore: SettingsDataStore,
    application: Application
): BaseViewModel(application) {
    val shouldOpenSetup = settingsDataStore.apiKey
        .map { it == null }
        .distinctUntilChanged()
        .flowOn(Dispatchers.IO)
}