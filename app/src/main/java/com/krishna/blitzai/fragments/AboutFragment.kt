package com.krishna.blitzai.fragments

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.platform.LocalUriHandler

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AboutFragment() {
    val uriHandler = LocalUriHandler.current

    Scaffold { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding).fillMaxSize()) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    text = "Developer: Krishna",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(bottom = 16.dp)
                )



                Spacer(modifier = Modifier.height(24.dp))


                ElevatedButton(
                    onClick = { uriHandler.openUri("https://github.com/KrishnaSSH/Blitz-AI") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(56.dp)
                        .padding(bottom = 16.dp)
                ) {
                    Text(
                        text = "Visit GitHub Repo",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp
                        )
                    )
                }


                ElevatedButton(
                    onClick = { uriHandler.openUri("https://t.me/BlitzzAI") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(56.dp)
                        .padding(bottom = 16.dp)
                ) {
                    Text(
                        text = "Join Telegram Channel",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp // Ensure sp is imported correctly
                        )
                    )
                }

                // Donate Button
                ElevatedButton(
                    onClick = { uriHandler.openUri("https://github.com/krishnassh/") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(56.dp)
                        .padding(bottom = 16.dp)
                ) {
                    Text(
                        text = "Donate",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp
                        )
                    )
                }
            }
        }
    }
}
