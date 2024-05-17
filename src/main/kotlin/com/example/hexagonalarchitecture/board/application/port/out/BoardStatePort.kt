package com.example.hexagonalarchitecture.board.application.port.out

import com.example.hexagonalarchitecture.board.adapter.out.persistence.BoardJpaEntity
import com.example.hexagonalarchitecture.board.application.port.BoardCommand

interface BoardStatePort {
    fun findByTitle(command: BoardCommand): BoardJpaEntity?
}