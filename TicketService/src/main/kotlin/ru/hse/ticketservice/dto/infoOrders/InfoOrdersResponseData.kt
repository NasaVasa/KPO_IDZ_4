package ru.nasavasa.ticketservice.dto.infoOrders

import ru.nasavasa.ticketservice.dto.ResponseData
import ru.nasavasa.ticketservice.dto.infoOrder.InfoOrderResponseData

data class InfoOrdersResponseData(
    val orders: List<InfoOrderResponseData>,
) : ResponseData()