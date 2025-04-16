package com.app.template_compose_mvvm.ui.base

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

open class BaseViewModel : ViewModel() {

    private val _errorMessage = MutableStateFlow<String?>(null)
    val errorMessage: StateFlow<String?> get() = _errorMessage

    private val _isLoading = MutableStateFlow(false)
    val isLoading: StateFlow<Boolean> get() = _isLoading

    fun clearErrorMessage() {
        _errorMessage.value = null
    }

    fun setErrorMessage(message: String?) {
        _errorMessage.value = message
    }

    fun setLoading(isLoading: Boolean) {
        _isLoading.value = isLoading
    }
}