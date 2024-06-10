package ru.nasavasa.ticketservice.service

import org.springframework.stereotype.Service
import ru.nasavasa.ticketservice.repository.StationRepository
import ru.nasavasa.ticketservice.model.Station

@Service
class StationService(
    private val stationRepository: StationRepository,
) {
    fun getAllStations(): List<Station> {
        val stations = stationRepository.findAll()
        return stations
    }
}
