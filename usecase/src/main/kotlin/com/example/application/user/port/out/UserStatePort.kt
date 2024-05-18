package com.example.application.user.port.out

import com.example.application.user.port.UserCommand
import com.example.domain.user.User

interface UserStatePort {
    fun findByNickname(command: UserCommand): User?
}