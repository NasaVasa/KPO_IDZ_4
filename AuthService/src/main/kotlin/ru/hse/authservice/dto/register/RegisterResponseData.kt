package ru.nasavasa.authservice.dto.register

import ru.nasavasa.authservice.dto.ResponseData

data class RegisterResponseData(
    val token: String,
) : ResponseData()