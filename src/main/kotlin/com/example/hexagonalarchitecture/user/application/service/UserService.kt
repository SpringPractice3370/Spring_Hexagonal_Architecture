package com.example.hexagonalarchitecture.user.application.service

import com.example.hexagonalarchitecture.user.adapter.`in`.web.UserResponse
import com.example.hexagonalarchitecture.user.application.port.`in`.UserUseCase
import com.example.hexagonalarchitecture.user.application.port.out.UserPort
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userPort: UserPort
): UserUseCase {
    override fun getUserByNickname(nickname: String): UserResponse {
        val user = userPort.findByNickname(nickname)
            ?: throw IllegalArgumentException("사용자를 찾을 수 없습니다. nickname: $nickname")
        return UserResponse(
            id = user.id,
            nickname = user.nickname
        )
    }
}