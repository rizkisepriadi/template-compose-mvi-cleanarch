package com.app.template_compose_mvi_cleanarch.ui.features.greeting

sealed class GreetingIntent {
    object LoadGreeting : GreetingIntent()
}
