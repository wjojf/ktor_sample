package com.example.domain.user.repository

import com.example.domain.user.models.User


interface UserRepository{
    suspend fun getUser(id: Int): User
}