package com.example.hexagonalarchitecture.user.adapter.out.persistence

import com.example.hexagonalarchitecture.user.application.port.out.UserPort
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Transactional(readOnly = true)
@Component
class UserPersistenceAdapter(
    private val userRepository: UserRepository
): UserPort {
    override fun findByNickname(nickname: String): UserJpaEntity? {
        return userRepository.findByNickname(nickname)
    }
}