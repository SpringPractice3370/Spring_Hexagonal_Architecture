package com.example.hexagonalarchitecture.user.adapter.`in`.web

import com.example.hexagonalarchitecture.user.application.port.UserCommand
import com.example.hexagonalarchitecture.user.application.port.`in`.UserUseCase
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(
    private val userUseCase: UserUseCase
) {
    @GetMapping("/v1/users")
    fun getUserByNickname(
        nickname: String
    ): UserResponse {
        return userUseCase.getUserByNickname(
            command = UserCommand(nickname = nickname)
        )
    }

}