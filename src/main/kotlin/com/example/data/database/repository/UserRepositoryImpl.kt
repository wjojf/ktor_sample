package com.example.data.database.repository

import com.example.di.DatabaseFactory.dbQuery
import com.example.data.database.entity.UserTable
import com.example.data.database.entity.mapper.toUser
import com.example.domain.user.models.User
import com.example.domain.user.repository.UserRepository
import org.jetbrains.exposed.sql.SqlExpressionBuilder.eq
import org.jetbrains.exposed.sql.select

class UserRepositoryImpl: UserRepository {
    override suspend fun getUser(id: Int): User {
        val userRow = dbQuery {
            UserTable.select(
                UserTable.id eq id
            ).first()
        }

        return userRow.toUser()!!
    }
}