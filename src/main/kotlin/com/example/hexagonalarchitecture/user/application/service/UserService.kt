package com.example.hexagonalarchitecture.user.application.service

import com.example.hexagonalarchitecture.user.adapter.`in`.web.UserResponse
import com.example.hexagonalarchitecture.user.application.port.`in`.UserCommand
import com.example.hexagonalarchitecture.user.application.port.`in`.UserUseCase
import com.example.hexagonalarchitecture.user.application.port.out.UserStateCommand
import com.example.hexagonalarchitecture.user.application.port.out.UserStatePort
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userStatePort: UserStatePort
) : UserUseCase {
    override fun getUserByNickname(command: UserCommand): UserResponse {

        val user = userStatePort.findByNickname(UserStateCommand(nickname = command.nickname))
            ?: throw IllegalArgumentException("사용자를 찾을 수 없습니다. nickname: ${command.nickname}")
        return UserResponse(
            id = user.id,
            nickname = user.nickname
        )
    }
}