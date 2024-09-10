package com.krishna.blitzai

import android.os.Bundle
import android.view.WindowInsetsController
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
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsControllerCompat
import com.krishna.blitzai.DrawerItem.*
import com.krishna.blitzai.network.NetworkClient
import com.krishna.blitzai.ui.theme.ChatCoreTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Set the status bar and navigation bar colors to blend with the activity
        window.statusBarColor = Color.Transparent.toArgb()
        window.navigationBarColor = Color.Transparent.toArgb()

        // Control the appearance of icons in the status bar and navigation bar
        WindowCompat.setDecorFitsSystemWindows(window, false)
        val insetsController = WindowInsetsControllerCompat(window, window.decorView)
        insetsController.isAppearanceLightStatusBars = false // Set to true if you want light icons
        insetsController.isAppearanceLightNavigationBars = false // Set to true if you want light icons

        setContent {
            ChatCoreTheme {
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

    var inputText by remember { mutableStateOf("") }
    var responseText by remember { mutableStateOf("") }

    val apiKey = BuildConfig.GROQ_API_KEY // Access API key from BuildConfig

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet {
                DrawerContent(
                    onItemSelected = { item ->
                        coroutineScope.launch {
                            drawerState.close()
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
                    title = { Text("Blitz AI", fontSize = 30.sp) },
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
            bottomBar = {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp, vertical = 30.dp)
                        .clip(MaterialTheme.shapes.medium)
                        .background(MaterialTheme.colorScheme.surface)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(end = 8.dp)
                    ) {
                        TextField(
                            value = inputText,
                            onValueChange = { inputText = it },
                            placeholder = { Text("Type your query here") },
                            modifier = Modifier
                                .weight(1f)
                                .padding(end = 8.dp)
                                .clip(MaterialTheme.shapes.extraLarge)
                                .background(MaterialTheme.colorScheme.primary.copy(alpha = 0.1f)),
                            colors = TextFieldDefaults.colors(
                                focusedTextColor = MaterialTheme.colorScheme.onSurface,
                                unfocusedTextColor = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f),
                                disabledTextColor = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f),
                                errorTextColor = MaterialTheme.colorScheme.error,
                                focusedContainerColor = MaterialTheme.colorScheme.primary.copy(alpha = 0.1f),
                                unfocusedContainerColor = MaterialTheme.colorScheme.primary.copy(alpha = 0.1f),
                                disabledContainerColor = MaterialTheme.colorScheme.primary.copy(alpha = 0.05f),
                                errorContainerColor = MaterialTheme.colorScheme.errorContainer,
                                cursorColor = MaterialTheme.colorScheme.primary,
                                errorCursorColor = MaterialTheme.colorScheme.error,
                                focusedIndicatorColor = Color.Transparent,
                                unfocusedIndicatorColor = Color.Transparent,
                                disabledIndicatorColor = Color.Transparent
                            )
                        )

                        IconButton(onClick = {
                            coroutineScope.launch {
                                val result = NetworkClient.postRequest(apiKey, inputText)
                                if (result != null) {
                                    responseText = result
                                } else {
                                    responseText = "Failed to get response"
                                }
                                inputText = "" // Clear the input field
                            }
                        }) {
                            Icon(Icons.AutoMirrored.Filled.Send, contentDescription = "Send")
                        }

                    }
                }
            }
        ) { innerPadding ->
            Box(modifier = Modifier.padding(innerPadding).fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                ) {
                    Text(text = "Query: $inputText", fontSize = 20.sp, color = Color.White)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(text = "Response: $responseText", fontSize = 20.sp, color = Color.White)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    ChatCoreTheme {
        MainScreen()
    }
}

@Composable
fun DrawerContent(onItemSelected: (DrawerItem) -> Unit) {
    Column {
        Text(
            text = "Blitz AI",
            modifier = Modifier.padding(20.dp),
            style = MaterialTheme.typography.headlineSmall.copy(fontSize = 30.sp)
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

@Preview(showBackground = true)
@Composable
fun DrawerContentPreview() {
    ChatCoreTheme {
        DrawerContent(onItemSelected = {})
    }
}

enum class DrawerItem {
    NewChat, Personalities, Settings, About
}
