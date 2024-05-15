package com.example.hexagonalarchitecture.user.adapter.out.persistence

import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<UserJpaEntity, Long> {
    fun findByNickname(nickname: String): UserJpaEntity?
}