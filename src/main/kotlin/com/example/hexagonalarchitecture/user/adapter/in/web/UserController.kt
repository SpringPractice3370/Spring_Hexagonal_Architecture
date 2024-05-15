package com.example.hexagonalarchitecture.user.adapter.`in`.web

import com.example.hexagonalarchitecture.user.application.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(
    private val userService: UserService
) {
    @GetMapping("/v1/users")
    fun getUserByNickname(
        nickname: String
    ): UserResponse {
        return userService.getUserByNickname(nickname)
    }

}