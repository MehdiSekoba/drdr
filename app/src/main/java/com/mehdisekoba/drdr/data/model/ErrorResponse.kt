package com.mehdisekoba.drdr.data.model

import com.google.gson.annotations.SerializedName

data class ErrorResponse(
    @SerializedName("errors")
    val errors: Map<String, List<String>>?,
    @SerializedName("message")
    val message: String? // The given data was invalid.
)