package com.example.application.user.port.`in`

import com.example.application.user.dto.UserResponse
import com.example.application.user.port.UserCommand

interface UserUseCase {
    fun getUserByNickname(command: UserCommand): UserResponse
}