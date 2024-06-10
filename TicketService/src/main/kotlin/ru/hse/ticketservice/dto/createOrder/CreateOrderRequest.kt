package ru.nasavasa.ticketservice.dto.createOrder


data class CreateOrderRequest(
    val fromStationId : Long,
    val toStationId : Long,
)