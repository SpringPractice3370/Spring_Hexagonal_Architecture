package com.example.hexagonalarchitecture.user.application.service

import com.example.hexagonalarchitecture.user.adapter.`in`.web.UserResponse
import com.example.hexagonalarchitecture.user.adapter.out.persistence.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userRepository: UserRepository
) {
    fun getUserByNickname(nickname: String): UserResponse {
        val user = userRepository.findByNickname(nickname)
            ?: throw IllegalArgumentException("사용자를 찾을 수 없습니다. nickname: $nickname")
        return UserResponse(
            id = user.id,
            nickname = user.nickname
        )
    }
}