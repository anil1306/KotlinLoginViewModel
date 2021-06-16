package com.app.kotlinloginviewmodel.modellogin

import com.google.gson.annotations.SerializedName

data class PhoneNumber(@SerializedName("isVerified")
                       val isVerified: Boolean = false,
                       @SerializedName("value")
                       val value: String = "")