package com.app.kotlinloginviewmodel.remote


class LoginBody() {
    private var userName: String=""
    private var password: String=""
    private var fcmToken: String=""

    constructor(userName: String, password: String, fcmToken: String) : this() {
        this.userName = userName
        this.password = password
        this.fcmToken = fcmToken
    }
}
