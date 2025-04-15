package com.app.template_compose_mvi_cleanarch.domain.usecase

import com.app.template_compose_mvi_cleanarch.domain.repository.GreetingRepository

class GetGreetingUseCase(private val repository: GreetingRepository) {
    operator fun invoke(): String = repository.getGreeting()
}
