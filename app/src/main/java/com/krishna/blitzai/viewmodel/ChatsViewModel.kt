package com.krishna.blitzai.viewmodel

import android.app.Application
import androidx.lifecycle.viewModelScope
import com.krishna.blitzai.database.AppDatabase
import com.krishna.blitzai.database.entity.Chat
import com.krishna.blitzai.viewmodel.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class ChatsViewModel @Inject constructor(
    private val database: AppDatabase,
    application: Application
): BaseViewModel(application) {

    val chatsWithMessages = database.chatsDao().getAll().map {
        it.sortedByDescending { chatWithMessages ->
            chatWithMessages.messages.lastOrNull()?.time ?: chatWithMessages.chat.createdTime
        }
    }.flowOn(Dispatchers.IO)

    fun createChat(onCreated: (Chat) -> Unit) = viewModelScope.onIO {
        val chat = Chat().run {
            copy(
                id = database.chatsDao().insert(this)
            )
        }

        withContext(Dispatchers.Main) {
            onCreated(chat)
        }
    }

    fun deleteChat(chat: Chat) = viewModelScope.onIO {
        database.chatsDao().delete(chat)
    }
}