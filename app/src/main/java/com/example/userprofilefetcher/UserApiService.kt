package com.example.userprofilefetcher

import retrofit2.Response
import retrofit2.http.GET

interface UserApiService {
    @GET("users/1")
    suspend fun getUser(): Response<User>
}