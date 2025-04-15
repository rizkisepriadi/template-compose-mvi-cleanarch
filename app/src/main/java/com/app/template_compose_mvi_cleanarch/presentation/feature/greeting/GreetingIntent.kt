package com.app.template_compose_mvi_cleanarch.presentation.feature.greeting

sealed class GreetingIntent {
    object LoadGreeting : GreetingIntent()
}
