package com.example.userprofilefetcher

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

          private const val BASE_URL = "https://jsonplaceholder.typicode.com/"

    val api: UserApiService by lazy {
             Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(UserApiService::class.java)
    }
}