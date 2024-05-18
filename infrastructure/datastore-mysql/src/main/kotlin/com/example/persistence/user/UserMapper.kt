package com.example.persistence.user

import com.example.domain.user.User

object UserMapper {
    fun mapToDomainEntity(userJpaEntity: UserJpaEntity): User {
        return User(
            id = userJpaEntity.id,
            nickname = userJpaEntity.nickname,
        )
    }

    fun mapToJpaEntity(user: User): UserJpaEntity {
        return UserJpaEntity(
            id = user.id,
            nickname = user.nickname,
        )
    }
}