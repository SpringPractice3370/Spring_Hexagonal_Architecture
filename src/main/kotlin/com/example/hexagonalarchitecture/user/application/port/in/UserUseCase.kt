package com.example.hexagonalarchitecture.user.application.port.`in`

import com.example.hexagonalarchitecture.user.adapter.`in`.web.UserResponse
import com.example.hexagonalarchitecture.user.application.port.UserCommand

interface UserUseCase {
    fun getUserByNickname(command: UserCommand): UserResponse
}