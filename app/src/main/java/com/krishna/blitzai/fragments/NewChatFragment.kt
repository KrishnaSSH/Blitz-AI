package com.krishna.blitzai.fragments

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bolt // Replace this with the actual icon if available

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NewChatFragment() {
    Scaffold() { innerPadding ->
        Box(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = Icons.Filled.Bolt, // Use the appropriate icon
                contentDescription = "Electric Bolt",
                modifier = Modifier.size(150.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun NewChatFragmentPreview() {
    NewChatFragment()
}
