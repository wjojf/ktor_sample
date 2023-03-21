package com.example.presentation.service.user

import com.example.domain.user.models.User
import com.example.domain.user.repository.UserRepository
import com.example.presentation.resources.BaseResponse
import com.example.presentation.resources.mapper.toSuccessResponse

class UserService(private val repository: UserRepository) {

    suspend fun getUserById(id: Int): BaseResponse<User> {
        return repository.getUser(id).toSuccessResponse("ok")
    }

}