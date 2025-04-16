package com.app.template_compose_mvi_cleanarch.data

import com.app.template_compose_mvi_cleanarch.domain.repository.IGreetingRepository

class GreetingRepository : IGreetingRepository {
    override fun getGreeting(): String = "Hello from Clean Architecture!"
}