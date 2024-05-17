package com.example.hexagonalarchitecture.board.application.port.out

import com.example.hexagonalarchitecture.board.adapter.out.persistence.BoardJpaEntity

interface BoardPort {
    fun findByTitle(title: String): BoardJpaEntity?
}