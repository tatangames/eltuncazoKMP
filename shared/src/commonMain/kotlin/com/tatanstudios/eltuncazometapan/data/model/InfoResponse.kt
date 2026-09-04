package com.tatanstudios.eltuncazometapan.data.model

import kotlinx.serialization.Serializable

@Serializable
data class InfoResponse(
    val count: Int,
    val pages: Int,
    val next: String?,
    val prev: String?
)