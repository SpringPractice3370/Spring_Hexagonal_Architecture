package com.example.hexagonalarchitecture.user.application.port.out

import com.example.hexagonalarchitecture.user.adapter.out.persistence.UserJpaEntity

interface UserPort {
    fun findByNickname(nickname: String): UserJpaEntity?
}