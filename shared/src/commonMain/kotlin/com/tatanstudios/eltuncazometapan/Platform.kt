package com.tatanstudios.eltuncazometapan

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform