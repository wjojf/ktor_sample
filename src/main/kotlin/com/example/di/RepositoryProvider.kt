package com.example.di

import com.example.domain.user.repository.UserRepository
import com.example.data.database.repository.UserRepositoryImpl

object RepositoryProvider {
    fun provideUserRepository(): UserRepository = UserRepositoryImpl()
}