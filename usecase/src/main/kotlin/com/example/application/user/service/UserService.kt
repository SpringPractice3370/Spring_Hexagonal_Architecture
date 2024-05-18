package com.example.application.user.service

import com.example.application.user.dto.UserResponse
import com.example.application.user.port.UserCommand
import com.example.application.user.port.`in`.UserUseCase
import com.example.application.user.port.out.UserStatePort
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userStatePort: UserStatePort
) : UserUseCase {
    override fun getUserByNickname(command: UserCommand): UserResponse {

        val user = userStatePort.findByNickname(UserCommand(nickname = command.nickname))
            ?: throw IllegalArgumentException("사용자를 찾을 수 없습니다. nickname: ${command.nickname}")
        return UserResponse(
            id = user.id,
            nickname = user.nickname
        )
    }
}