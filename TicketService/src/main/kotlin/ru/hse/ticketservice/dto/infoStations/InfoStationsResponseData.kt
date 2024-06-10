package ru.nasavasa.ticketservice.dto.infoStations

import ru.nasavasa.ticketservice.dto.ResponseData
import ru.nasavasa.ticketservice.model.Station

data class InfoStationsResponseData(
    val stations: List<Station>,
) : ResponseData()