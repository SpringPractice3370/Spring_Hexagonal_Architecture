package com.example.hexagonalarchitecture.user.adapter.out.persistence

import com.example.hexagonalarchitecture.user.application.port.UserCommand
import com.example.hexagonalarchitecture.user.application.port.out.UserStatePort
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Transactional(readOnly = true)
@Component
class UserPersistenceAdapter(
    private val userRepository: UserRepository
): UserStatePort {
    override fun findByNickname(command: UserCommand): UserJpaEntity? {
        return userRepository.findByNickname(command.nickname)
    }
}