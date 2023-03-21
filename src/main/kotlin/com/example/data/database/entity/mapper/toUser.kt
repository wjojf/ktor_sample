package com.example.data.database.entity.mapper

import com.example.data.database.entity.UserTable
import com.example.domain.user.models.User
import org.jetbrains.exposed.sql.ResultRow

fun ResultRow?.toUser(): User? {
    if (this == null) {
        return null
    }

    return User(
        id = this[UserTable.id],
        fullName = this[UserTable.fullName],
        email = this[UserTable.email],
        createdAt = this[UserTable.createdAt].toString()
    )

}