package com.app.template_compose_mvi_cleanarch.domain.usecase

import com.app.template_compose_mvi_cleanarch.domain.repository.IGreetingRepository

class GetGreetingUseCase(private val repository: IGreetingRepository) {
    operator fun invoke(): String = repository.getGreeting()
}
