package com.app.kotlinloginviewmodel.modellogin

import com.google.gson.annotations.SerializedName

data class Name(@SerializedName("firstName")
                val firstName: String = "")