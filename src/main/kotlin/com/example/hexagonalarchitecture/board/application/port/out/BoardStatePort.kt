package com.example.hexagonalarchitecture.board.application.port.out

import com.example.hexagonalarchitecture.board.adapter.out.persistence.BoardJpaEntity

interface BoardStatePort {
    fun findByTitle(command: BoardStateCommand): BoardJpaEntity?
}