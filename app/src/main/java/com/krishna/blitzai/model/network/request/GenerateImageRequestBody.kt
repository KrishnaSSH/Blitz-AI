package com.krishna.blitzai.model.network.request

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class GenerateImageRequestBody(
    @SerializedName("prompt") val prompt: String,
    @SerializedName("size") val size: String = "1024x1024"
)