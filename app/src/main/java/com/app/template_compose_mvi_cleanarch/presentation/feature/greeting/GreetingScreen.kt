package com.app.template_compose_mvi_cleanarch.presentation.feature.greeting

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun GreetingScreen(viewModel: GreetingViewModel = hiltViewModel()) {
    LaunchedEffect(Unit) {
        viewModel.onIntent(GreetingIntent.LoadGreeting)
    }

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = viewModel.uiState, style = MaterialTheme.typography.headlineMedium)
    }
}

