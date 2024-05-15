package com.example.hexagonalarchitecture.board.adapter.out.persistence

import org.springframework.data.jpa.repository.JpaRepository

interface BoardRepository : JpaRepository<BoardJpaEntity, Long> {
    fun findByTitle(title: String): BoardJpaEntity?
}