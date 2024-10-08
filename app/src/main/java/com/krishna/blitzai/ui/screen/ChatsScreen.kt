package com.krishna.blitzai.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavController
import com.krishna.blitzai.R
import com.krishna.blitzai.model.Screen
import com.krishna.blitzai.ui.widget.Chat
import com.krishna.blitzai.ui.widget.ErrorAlertDialog
import com.krishna.blitzai.viewmodel.ChatsViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChatsScreen(navController: NavController) {
    val viewModel = hiltViewModel<ChatsViewModel>()

    val chatsWithMessages by viewModel.chatsWithMessages.collectAsStateWithLifecycle(initialValue = emptyList())

    val scrollBehavior = TopAppBarDefaults.exitUntilCollapsedScrollBehavior(rememberTopAppBarState())

    Box(modifier = Modifier.fillMaxSize()) {
        Column {
            LargeTopAppBar(
                title = { Text(text = stringResource(id = R.string.chats)) },
                actions = {

                    IconButton(onClick = { navController.navigate(Screen.Settings.route) }) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_settings),
                            contentDescription = null
                        )
                    }
                },
                scrollBehavior = scrollBehavior
            )

            LazyColumn(
                modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
                contentPadding = PaddingValues(
                    top = 16.dp,
                    start = 16.dp,
                    end = 16.dp,
                    bottom = bottomPaddingForFAB()
                ),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                items(
                    chatsWithMessages,
                    key = { it.chat.id }
                ) { chatWithMessages ->
                    Chat(
                        chatWithMessages = chatWithMessages,
                        delete = { viewModel.deleteChat(chatWithMessages.chat) }
                    ) {
                        navController.navigate("${Screen.Chat.route}/${chatWithMessages.chat.id}")
                    }
                }
            }
        }

        ExtendedFloatingActionButton(
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(16.dp)
                .navigationBarsPadding(),
            onClick = {
                viewModel.createChat {
                    navController.navigate("${Screen.Chat.route}/${it.id}")
                }
            },
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_add),
                    contentDescription = null
                )
            },
            text = { Text("New Chat") }
        )

        ErrorAlertDialog(viewModel = viewModel)
    }
}

@Composable
fun bottomPaddingForFAB() = 88.dp + WindowInsets.navigationBars.asPaddingValues().calculateBottomPadding()
