package com.krishna.chatcore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Message
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.krishna.chatcore.DrawerItem.*
import com.krishna.chatcore.ui.theme.ChatCoreTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChatCoreTheme {
                // Main content
                MainScreen()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val coroutineScope = rememberCoroutineScope()

    // Add a state variable to hold the text input
    var inputText by remember { mutableStateOf("") }

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet {
                DrawerContent(
                    onItemSelected = { item ->
                        coroutineScope.launch {
                            drawerState.close()
                            // Handle item selection
                            when (item) {
                                About -> { /* Handle About action */ }
                                NewChat -> TODO()
                                Personalities -> TODO()
                                Settings -> TODO()
                            }
                        }
                    }
                )
            }
        }
    ) {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text("ChatCore", fontSize = 20.sp) },
                    navigationIcon = {
                        IconButton(onClick = {
                            coroutineScope.launch {
                                if (drawerState.isClosed) drawerState.open() else drawerState.close()
                            }
                        }) {
                            Icon(Icons.Filled.Menu, contentDescription = "Menu")
                        }
                    }
                )
            },
            floatingActionButton = {
                // FloatingActionButton removed
            },
            bottomBar = {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 8.dp)
                        .clip(MaterialTheme.shapes.medium)
                        .background(MaterialTheme.colorScheme.surface)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(end = 8.dp)
                    ) {
                        // Display and update the text input
                        TextField(
                            value = inputText, // Bind the state variable
                            onValueChange = { inputText = it }, // Update the state on change
                            placeholder = { Text("Type your query here") },
                            modifier = Modifier
                                .weight(1f)
                                .padding(end = 8.dp)
                                .clip(MaterialTheme.shapes.extraLarge) // Use extraLarge for pill shape
                                .background(MaterialTheme.colorScheme.primary.copy(alpha = 0.1f)), // Background color for the pill
                            colors = TextFieldDefaults.colors(
                                focusedTextColor = MaterialTheme.colorScheme.onSurface,
                                unfocusedTextColor = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f),
                                disabledTextColor = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f),
                                errorTextColor = MaterialTheme.colorScheme.error,
                                focusedContainerColor = MaterialTheme.colorScheme.primary.copy(alpha = 0.1f), // Lighter background when focused
                                unfocusedContainerColor = MaterialTheme.colorScheme.primary.copy(alpha = 0.1f), // Lighter background when unfocused
                                disabledContainerColor = MaterialTheme.colorScheme.primary.copy(alpha = 0.05f),
                                errorContainerColor = MaterialTheme.colorScheme.errorContainer,
                                cursorColor = MaterialTheme.colorScheme.primary,
                                errorCursorColor = MaterialTheme.colorScheme.error,
                                focusedIndicatorColor = Color.Transparent, // Remove focused underline
                                unfocusedIndicatorColor = Color.Transparent, // Remove unfocused underline
                                disabledIndicatorColor = Color.Transparent // Remove disabled underline
                            )
                        )


                        IconButton(onClick = { /* Handle send button click */ }) {
                            Icon(Icons.AutoMirrored.Filled.Send, contentDescription = "Send")
                        }
                    }
                }
            }
        ) { innerPadding ->
            Box(modifier = Modifier.padding(innerPadding).fillMaxSize()) {
                // Main screen content
            }
        }
    }
}


@Composable
fun DrawerContent(onItemSelected: (DrawerItem) -> Unit) {
    Column {
        Text(
            text = "ChatCore",
            modifier = Modifier.padding(16.dp),
            style = MaterialTheme.typography.headlineSmall.copy(fontSize = 20.sp)
        )
        HorizontalDivider()
        NavigationDrawerItem(
            icon = { Icon(Icons.AutoMirrored.Filled.Message, contentDescription = null) },
            label = { Text("New Chat") },
            selected = false,
            onClick = { onItemSelected(NewChat) }
        )
        NavigationDrawerItem(
            icon = { Icon(Icons.Filled.Person, contentDescription = null) },
            label = { Text("Personalities") },
            selected = false,
            onClick = { onItemSelected(Personalities) }
        )
        NavigationDrawerItem(
            icon = { Icon(Icons.Filled.Settings, contentDescription = null) },
            label = { Text("Settings") },
            selected = false,
            onClick = { onItemSelected(Settings) }
        )
        NavigationDrawerItem(
            icon = { Icon(Icons.Filled.Info, contentDescription = null) },
            label = { Text("About") },
            selected = false,
            onClick = { onItemSelected(About) }
        )
    }
}

enum class DrawerItem {
    NewChat, Personalities, Settings, About
}