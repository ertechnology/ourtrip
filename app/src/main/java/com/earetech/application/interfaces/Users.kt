package com.earetech.application.interfaces

import com.earetech.application.models.ResponseUsers
import retrofit2.Call
import retrofit2.http.GET

interface Users {
    @GET("users")
    fun getUsers(): Call<List<ResponseUsers>>
}