package ru.nasavasa.ticketservice.repository

import ru.nasavasa.ticketservice.model.Order
import org.springframework.data.jpa.repository.JpaRepository

interface OrderRepository : JpaRepository<Order, Long> {
    fun findByStatus(status: Int): List<Order>
    fun findByUserId(userId: Long): List<Order>
}
