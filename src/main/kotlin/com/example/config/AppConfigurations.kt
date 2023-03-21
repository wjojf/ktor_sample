package com.example.config

import com.example.di.DatabaseFactory
import com.example.di.ServiceProvider
import com.example.presentation.routes.user.userRoutes
import io.ktor.server.application.*
import io.ktor.serialization.jackson.*
import io.ktor.client.content.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.server.plugins.*

fun Application.configureDatabase() {
    DatabaseFactory.connect()
}

fun Application.configureContentNegotiation() {
    install(ContentNegotiation) {
        jackson()
    }
}

fun Application.configureRouting(){
    userRoutes(ServiceProvider.provideUserService())
}