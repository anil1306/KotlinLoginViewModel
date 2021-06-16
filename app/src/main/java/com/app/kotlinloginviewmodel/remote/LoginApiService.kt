package com.app.kotlinloginviewmodel.remote

import com.app.kotlinloginviewmodel.modellogin.LoginModel
import com.app.kotlinloginviewmodel.remote.LoginBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface LoginApiService {


    @POST("user-management/users/login")
    suspend fun logInPostRequest(@Body body: LoginBody?): LoginModel

}