package com.anikinkirill.example

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform