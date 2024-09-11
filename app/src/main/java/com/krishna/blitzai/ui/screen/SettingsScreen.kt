package com.krishna.blitzai.ui.screen

import androidx.annotation.StringRes
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.krishna.blitzai.R
import com.krishna.blitzai.ui.widget.ErrorAlertDialog
import com.krishna.blitzai.ui.widget.NavigationBackIcon
import com.krishna.blitzai.viewmodel.SettingsViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsScreen(navController: NavController) {
    val viewModel = hiltViewModel<SettingsViewModel>()

    val scrollBehavior = TopAppBarDefaults.exitUntilCollapsedScrollBehavior(rememberTopAppBarState())

    var selectedModel by remember { mutableStateOf("mixtral-8x7b-32768") }
    var customModel by remember { mutableStateOf("") }
    var showModelDropdown by remember { mutableStateOf(false) }

    Column {
        LargeTopAppBar(
            title = { Text(text = stringResource(id = R.string.settings)) },
            navigationIcon = { NavigationBackIcon(navController = navController) },
            scrollBehavior = scrollBehavior
        )

        Box(
            modifier = Modifier
                .fillMaxSize()
                .nestedScroll(scrollBehavior.nestedScrollConnection)
        ) {
            Column(
                modifier = Modifier
                    .verticalScroll(rememberScrollState())
                    .padding(horizontal = 10.dp)
            ) {
                Spacer(modifier = Modifier.size(10.dp))

                SettingsTextField(
                    value = viewModel.endpoint,
                    onValueChange = { viewModel.endpoint = it },
                    labelResource = R.string.endpoint,
                    viewModel = viewModel
                )

                Spacer(modifier = Modifier.size(10.dp))

                SettingsTextField(
                    value = viewModel.apiKey,
                    onValueChange = { viewModel.apiKey = it },
                    labelResource = R.string.api_key,
                    viewModel = viewModel
                )

                Spacer(modifier = Modifier.size(10.dp))

                // Model Selection Dropdown
                OutlinedTextField(
                    value = if (selectedModel == "Custom") customModel else selectedModel,
                    onValueChange = { newValue ->
                        if (selectedModel == "Custom") {
                            customModel = newValue
                            viewModel.model = newValue
                        }
                    },
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text("Model") },
                    trailingIcon = {
                        IconButton(onClick = { showModelDropdown = true }) {
                            Icon(
                                imageVector = Icons.Filled.ArrowDropDown,
                                contentDescription = "Select Model"
                            )
                        }


            }
                )

                // Dropdown Menu
                DropdownMenu(
                    expanded = showModelDropdown,
                    onDismissRequest = { showModelDropdown = false }
                ) {
                    listOf(
                        "mixtral-8x7b-32768",
                        "llama3-8b-8192",
                        "llama3-70b-8192",
                        "gemma-7b-it",
                        "gemma2-9b-it",
                        "Custom"
                    ).forEach { model ->
                        DropdownMenuItem(
                            text = { Text(model) },
                            onClick = {
                                selectedModel = model
                                showModelDropdown = false
                                if (model != "Custom") {
                                    viewModel.model = model
                                }
                            }
                        )
                    }
                }

                Spacer(modifier = Modifier.size(10.dp))

                SettingsTextField(
                    value = viewModel.temperature,
                    onValueChange = { viewModel.temperature = it },
                    labelResource = R.string.temperature,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Decimal),
                    viewModel = viewModel
                )
            }

            androidx.compose.animation.AnimatedVisibility(
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(16.dp)
                    .navigationBarsPadding(),
                visible = viewModel.changesMade,
                enter = fadeIn(),
                exit = fadeOut()
            ) {
                FloatingActionButton(
                    onClick = {
                        viewModel.save {
                            navController.popBackStack()
                        }
                    }
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_done),
                        contentDescription = null
                    )
                }
            }
        }

        ErrorAlertDialog(viewModel = viewModel)
    }
}

@Composable
private fun SettingsTextField(
    value: String,
    onValueChange: (String) -> Unit,
    @StringRes labelResource: Int,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    viewModel: SettingsViewModel
) {
    OutlinedTextField(
        modifier = Modifier.fillMaxWidth(),
        value = value,
        onValueChange = {
            onValueChange(it)
            viewModel.changesMade = true
        },
        label = { Text(text = stringResource(id = labelResource)) },
        keyboardOptions = keyboardOptions
    )
}
