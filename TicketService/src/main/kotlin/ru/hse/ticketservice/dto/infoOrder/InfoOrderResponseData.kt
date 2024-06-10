package ru.nasavasa.ticketservice.dto.infoOrder

import ru.nasavasa.ticketservice.dto.ResponseData

data class InfoOrderResponseData(
    val orderId: Long,
    val userId : Long,
    val fromStationId : Long,
    val toStationId : Long,
    val status : String
) : ResponseData()