package com.example.hexagonalarchitecture.user.application.port.out

import com.example.hexagonalarchitecture.user.adapter.out.persistence.UserJpaEntity
import com.example.hexagonalarchitecture.user.application.port.UserCommand

interface UserStatePort {
    fun findByNickname(command: UserCommand): UserJpaEntity?
}