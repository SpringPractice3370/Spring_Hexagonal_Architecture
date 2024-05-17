package com.example.hexagonalarchitecture.board.adapter.out.persistence

import com.example.hexagonalarchitecture.board.application.port.out.BoardPort
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Transactional(readOnly = true)
@Component
class BoardPersistenceAdapter(
    private val boardRepository: BoardRepository
): BoardPort {
    override fun findByTitle(title: String): BoardJpaEntity? {
        return boardRepository.findByTitle(title)
    }
}