package com.krishna.blitzai

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import com.krishna.blitzai.fragments.*
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

    var selectedScreen by remember { mutableStateOf<Screen>(Screen.NewChat) }
    var inputText by remember { mutableStateOf("") }
    var responseText by remember { mutableStateOf("") }

    val topBarTitle = when (selectedScreen) {
        Screen.NewChat -> "New Chat"
        Screen.Personalities -> "Personalities"
        Screen.Settings -> "Settings"
        Screen.About -> "About"
    }

    // Get the current WindowInsets
    val view = LocalView.current
    val density = LocalDensity.current.density
    val insets = ViewCompat.getRootWindowInsets(view)
    val imeBottom = insets?.isVisible(WindowInsetsCompat.Type.ime())?.let {
        insets.getInsets(WindowInsetsCompat.Type.ime()).bottom
    } ?: 0
    val bottomPadding = (imeBottom / density).dp

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet {
                DrawerContent(
                    onItemSelected = { item ->
                        coroutineScope.launch {
                            drawerState.close()
                            selectedScreen = item
                        }
                    }
                )
            }
        }
    ) {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text(topBarTitle, fontSize = 30.sp) },
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
                if (selectedScreen == Screen.NewChat) {
                    BottomAppBar(
                        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
                    ) {
                        TextField(
                            value = inputText,
                            onValueChange = { inputText = it },
                            placeholder = { Text("Type your query here") },
                            modifier = Modifier
                                .weight(1f)
                                .padding(end = 8.dp)
                                .clip(MaterialTheme.shapes.medium)
                                .background(MaterialTheme.colorScheme.surface)
                                .padding(bottom = bottomPadding), // Add bottom padding here
                            colors = TextFieldDefaults.colors(
                                focusedTextColor = MaterialTheme.colorScheme.onSurface,
                                unfocusedTextColor = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f),
                                cursorColor = MaterialTheme.colorScheme.primary,
                                focusedIndicatorColor = Color.Transparent,
                                unfocusedIndicatorColor = Color.Transparent
                            )
                        )

                        IconButton(onClick = {
                            // Handle Send action here
                            responseText = "Sent message: $inputText"
                            inputText = "" // Clear the input field
                        }) {
                            Icon(Icons.Filled.Send, contentDescription = "Send")
                        }
                    }
                }
            }
        ) { innerPadding ->
            Box(modifier = Modifier.padding(innerPadding).fillMaxSize()) {
                when (selectedScreen) {
                    Screen.NewChat -> NewChatFragment()
                    Screen.Personalities -> PersonalitiesFragment()
                    Screen.Settings -> SettingsFragment()
                    Screen.About -> AboutFragment()
                }
            }
        }
    }
}

@Composable
fun DrawerContent(onItemSelected: (Screen) -> Unit) {
    Column {
        Text(
            text = "Blitz AI",
            modifier = Modifier.padding(20.dp),
            style = MaterialTheme.typography.headlineSmall.copy(fontSize = 30.sp)
        )
        HorizontalDivider()
        NavigationDrawerItem(
            icon = { Icon(Icons.Filled.Message, contentDescription = null) },
            label = { Text("New Chat") },
            selected = false,
            onClick = { onItemSelected(Screen.NewChat) }
        )
        NavigationDrawerItem(
            icon = { Icon(Icons.Filled.Person, contentDescription = null) },
            label = { Text("Personalities") },
            selected = false,
            onClick = { onItemSelected(Screen.Personalities) }
        )
        NavigationDrawerItem(
            icon = { Icon(Icons.Filled.Settings, contentDescription = null) },
            label = { Text("Settings") },
            selected = false,
            onClick = { onItemSelected(Screen.Settings) }
        )
        NavigationDrawerItem(
            icon = { Icon(Icons.Filled.Info, contentDescription = null) },
            label = { Text("About") },
            selected = false,
            onClick = { onItemSelected(Screen.About) }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    ChatCoreTheme {
        MainScreen()
    }
}

enum class Screen {
    NewChat, Personalities, Settings, About
}
