package com.example.di

import com.example.di.RepositoryProvider
import com.example.domain.user.models.User
import com.example.presentation.service.user.UserService

object ServiceProvider {
    fun provideUserService(): UserService = UserService(RepositoryProvider.provideUserRepository())
}