package com.example.presentation.routes.user

import com.example.presentation.service.user.UserService
import com.example.security.UserIdPrincipalForUser
import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.userRoutes(service: UserService) {
    routing {
        route("/user") {
            get {
                val principal = call.principal<UserIdPrincipalForUser>()
                val result = service.getUserById(principal?.id!!)
                call.respond(result.statusCode, result)
            }
        }
    }
}


