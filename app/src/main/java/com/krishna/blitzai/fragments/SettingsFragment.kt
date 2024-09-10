package com.krishna.blitzai.fragments

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsFragment() {
    // State to keep track of each toggle's value
    var toggle1 by remember { mutableStateOf(false) }
    var toggle2 by remember { mutableStateOf(false) }
    var toggle3 by remember { mutableStateOf(false) }
    var toggle4 by remember { mutableStateOf(false) }
    var toggle5 by remember { mutableStateOf(false) }

    Scaffold { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding).fillMaxSize()) {
            Column(modifier = Modifier
                .padding(start = 16.dp, end = 16.dp, bottom = 16.dp) // Removed top padding
                .fillMaxSize()) {


                // Dummy toggles
                ToggleSwitch(label = "SDAI Image Generation", isChecked = toggle1) { toggle1 = it }
                ToggleSwitch(label = "PDF GPT", isChecked = toggle2) { toggle2 = it }
                ToggleSwitch(label = "Multiple Models ", isChecked = toggle3) { toggle3 = it }
                ToggleSwitch(label = "Elaborative ", isChecked = toggle4) { toggle4 = it }
                ToggleSwitch(label = "Image Support", isChecked = toggle5) { toggle5 = it }
            }
        }
    }
}
@Composable
fun ToggleSwitch(label: String, isChecked: Boolean, onCheckedChange: (Boolean) -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth() // Ensures the Row occupies the full width
            .padding(vertical = 8.dp)
            .heightIn(min = 48.dp), // Ensures a minimum height for better touch target
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Box(
            modifier = Modifier
                .weight(1f)
                .clickable { onCheckedChange(!isChecked) }
                .padding(16.dp) // Padding around the text
        ) {
            Text(
                text = label,
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.fillMaxWidth() // Ensures the Text occupies the full width within the Box
            )
        }
        Switch(
            checked = isChecked,
            onCheckedChange = onCheckedChange
        )
    }
}



