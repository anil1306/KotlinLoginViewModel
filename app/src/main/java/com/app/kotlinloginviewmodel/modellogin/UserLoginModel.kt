package com.app.kotlinloginviewmodel.modellogin

import android.util.Patterns


class UserLoginModel() {

    private lateinit var userName: String
    private lateinit var password: String
    private lateinit var fcmToken: String

    constructor(userName: String, password: String, fcmToken: String) : this() {
        this.userName = userName
        this.password = password
        this.fcmToken = fcmToken
    }

    val isEmailValid: Boolean
        get() = Patterns.EMAIL_ADDRESS.matcher(userName).matches()

  /*  val isPasswordLengthGreaterThan5: Boolean
        get() = (password?.length ?: > 5)

    val isfcmTokenNotNull: Boolean
        get() = (fcmToken!!.length > 1)*/

}