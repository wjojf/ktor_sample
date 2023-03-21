package com.example.presentation.resources.mapper

import com.example.domain.user.models.User
import com.example.presentation.resources.BaseResponse

fun User.toSuccessResponse(message: String): BaseResponse.SuccessResponse<User> {
    return BaseResponse.SuccessResponse(
        data = this,
        message=message
    )
}