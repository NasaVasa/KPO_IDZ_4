package ru.nasavasa.authservice.repository

import ru.nasavasa.authservice.model.Session
import org.springframework.data.jpa.repository.JpaRepository
import java.time.LocalDateTime

interface SessionRepository : JpaRepository<Session, Long> {
    fun findByToken(token: String): Session?
    fun findByUserId(userId: Long): Session?
}
