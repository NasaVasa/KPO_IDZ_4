package ru.nasavasa.authservice.dto.auth

import ru.nasavasa.authservice.dto.ResponseData

data class AuthResponseData(
    val token: String,
) : ResponseData()