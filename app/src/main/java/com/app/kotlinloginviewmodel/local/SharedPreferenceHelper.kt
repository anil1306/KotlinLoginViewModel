package com.app.kotlinloginviewmodel.local

interface SharedPreferenceHelper {

    fun clearPrefs()

    fun setIdToken(idToken: String)
    fun getIdToken(): String
}