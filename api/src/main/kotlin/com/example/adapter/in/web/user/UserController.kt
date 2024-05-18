package com.example.adapter.`in`.web.user

import com.example.application.user.dto.UserResponse
import com.example.application.user.port.UserCommand
import com.example.application.user.port.`in`.UserUseCase
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