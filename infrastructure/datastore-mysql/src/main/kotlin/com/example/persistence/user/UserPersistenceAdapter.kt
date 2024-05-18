package com.example.persistence.user

import com.example.application.user.port.UserCommand
import com.example.application.user.port.out.UserStatePort
import com.example.domain.user.User
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Transactional(readOnly = true)
@Repository
class UserPersistenceAdapter(
    private val userJpaRepository: UserJpaRepository
) : UserStatePort {
    override fun findByNickname(command: UserCommand): User {
        return userJpaRepository.findByNickname(command.nickname)
            ?.let { UserMapper.mapToDomainEntity(it) }
            ?: throw IllegalArgumentException("유저를 찾을 수 없습니다.")
    }
}