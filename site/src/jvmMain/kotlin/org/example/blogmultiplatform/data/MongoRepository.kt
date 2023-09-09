package org.example.blogmultiplatform.data

import org.example.blogmultiplatform.models.User

interface MongoRepository {
    suspend fun checkIfUserExist(user: User): User?
    suspend fun checkUserId(userId: String): Boolean
}