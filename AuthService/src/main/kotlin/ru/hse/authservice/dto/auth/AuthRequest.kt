package ru.nasavasa.authservice.dto.auth

data class AuthRequest(
    val email: String,
    val password: String
)