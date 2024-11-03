package com.example.userprofilefetcher

import retrofit2.Response


class UserRepository {
    suspend fun getUserProfile(): Response<User> {
        return RetrofitInstance.api.getUser()
        }
}