package com.example.domain.user.models

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
data class User(
    val id: Int,
    val fullName: String,
    val email: String,
    val createdAt: String
)
