package com.example.persistence.board

import org.springframework.data.jpa.repository.JpaRepository

interface BoardJpaRepository : JpaRepository<BoardJpaEntity, Long> {
    fun findByTitle(id: String): BoardJpaEntity?
}