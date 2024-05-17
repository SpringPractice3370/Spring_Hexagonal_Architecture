package com.example.hexagonalarchitecture.board.adapter.out.persistence

import com.example.hexagonalarchitecture.board.application.port.BoardCommand
import com.example.hexagonalarchitecture.board.application.port.out.BoardStatePort
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Transactional(readOnly = true)
@Component
class BoardPersistenceAdapter(
    private val boardRepository: BoardRepository
): BoardStatePort {
    override fun findByTitle(command: BoardCommand): BoardJpaEntity? {
        return boardRepository.findByTitle(command.title)
    }
}