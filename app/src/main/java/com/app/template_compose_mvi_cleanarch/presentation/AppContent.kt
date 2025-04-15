package com.app.template_compose_mvi_cleanarch.presentation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.app.template_compose_mvi_cleanarch.presentation.feature.greeting.GreetingScreen

@Composable
fun AppContent() {
    MaterialTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            GreetingScreen()
        }
    }
}