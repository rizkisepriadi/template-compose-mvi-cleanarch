package com.app.template_compose_mvi_cleanarch.domain.repository

interface GreetingRepository {
    fun getGreeting(): String
}