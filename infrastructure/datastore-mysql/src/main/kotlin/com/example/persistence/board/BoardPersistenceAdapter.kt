package com.example.persistence.board

import com.example.application.board.port.BoardCommand
import com.example.application.board.port.out.BoardStatePort
import com.example.domain.board.Board
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Transactional(readOnly = true)
@Repository
class BoardPersistenceAdapter(
    private val boardJpaRepository: BoardJpaRepository
) : BoardStatePort {
    override fun findByTitle(command: BoardCommand): Board {
        return boardJpaRepository.findByTitle(command.title)
            ?.let { BoardMapper.mapToDomainEntity(it) }
            ?: throw IllegalArgumentException("게시글을 찾을 수 없습니다.")
    }
}