package com.example.dhwallet

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform