package com.app.template_compose_mvi_cleanarch.domain.repository

interface IGreetingRepository {
    fun getGreeting(): String
}