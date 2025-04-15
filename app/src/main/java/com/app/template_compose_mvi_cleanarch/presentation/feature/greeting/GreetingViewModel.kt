package com.app.template_compose_mvi_cleanarch.presentation.feature.greeting

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.app.template_compose_mvi_cleanarch.domain.usecase.GetGreetingUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class GreetingViewModel @Inject constructor(
    private val getGreetingUseCase: GetGreetingUseCase
) : ViewModel() {

    var uiState by mutableStateOf("Loading...")
        private set

    fun onIntent(intent: GreetingIntent) {
        when (intent) {
            is GreetingIntent.LoadGreeting -> {
                uiState = getGreetingUseCase()
            }
        }
    }
}

