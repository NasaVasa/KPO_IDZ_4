package ru.nasavasa.authservice.dto.info

import ru.nasavasa.authservice.dto.ResponseData

data class InfoResponseData(
    val nickname: String,
    val email: String,
) : ResponseData()