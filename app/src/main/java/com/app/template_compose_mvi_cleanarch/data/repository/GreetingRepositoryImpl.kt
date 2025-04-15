package com.app.template_compose_mvi_cleanarch.data.repository

import com.app.template_compose_mvi_cleanarch.domain.repository.GreetingRepository

class GreetingRepositoryImpl : GreetingRepository {
    override fun getGreeting(): String = "Hello from Clean Architecture!"
}
