package com.examplekotlin.mvvmdemos

import retrofit2.http.GET

interface ApiService {
    @GET("users")
    suspend fun getUsers(): List<User>

}
