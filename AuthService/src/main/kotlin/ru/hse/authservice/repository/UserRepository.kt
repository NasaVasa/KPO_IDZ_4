package ru.nasavasa.authservice.repository

import ru.nasavasa.authservice.model.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long> {
    fun findByEmail(email: String): User?
    fun findByNickname(nickname: String): User?
}
