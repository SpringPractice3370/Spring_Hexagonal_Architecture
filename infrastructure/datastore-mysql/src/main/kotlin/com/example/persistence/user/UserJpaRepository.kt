package com.example.persistence.user

import org.springframework.data.jpa.repository.JpaRepository


interface UserJpaRepository: JpaRepository<UserJpaEntity, Long> {
    fun findByNickname(userId: String): UserJpaEntity?
}