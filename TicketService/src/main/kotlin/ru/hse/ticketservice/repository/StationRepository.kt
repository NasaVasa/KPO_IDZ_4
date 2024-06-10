package ru.nasavasa.ticketservice.repository

import ru.nasavasa.ticketservice.model.Station
import org.springframework.data.jpa.repository.JpaRepository

interface StationRepository : JpaRepository<Station, Long> {

}
