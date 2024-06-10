package ru.nasavasa.authservice.dto.register

data class RegisterRequest(
    val nickname: String,
    val email: String,
    val password: String
)