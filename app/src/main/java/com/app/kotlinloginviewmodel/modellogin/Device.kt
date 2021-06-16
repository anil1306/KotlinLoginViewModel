package com.app.kotlinloginviewmodel.modellogin

import com.google.gson.annotations.SerializedName

data class Device(@SerializedName("type")
                  val type: String = "",
                  @SerializedName("manufacturer")
                  val manufacturer: String = "")