package com.app.template_compose_mvi_cleanarch.di

import com.app.template_compose_mvi_cleanarch.data.GreetingRepository
import com.app.template_compose_mvi_cleanarch.domain.repository.IGreetingRepository
import com.app.template_compose_mvi_cleanarch.domain.usecase.GetGreetingUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideGreetingRepository(): IGreetingRepository {
        return GreetingRepository()
    }

    @Provides
    @Singleton
    fun provideGetGreetingUseCase(repository: IGreetingRepository): GetGreetingUseCase {
        return GetGreetingUseCase(repository)
    }
}
