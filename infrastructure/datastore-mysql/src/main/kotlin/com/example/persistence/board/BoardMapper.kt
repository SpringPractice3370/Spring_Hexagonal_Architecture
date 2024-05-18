package com.example.persistence.board

import com.example.domain.board.Board

object BoardMapper {
    fun mapToJpaEntity(board: Board): BoardJpaEntity {
        return BoardJpaEntity(
            id = board.id,
            title = board.title,
            content = board.content
        )
    }

    fun mapToDomainEntity(boardEntity: BoardJpaEntity): Board {
        return Board(
            id = boardEntity.id,
            title = boardEntity.title,
            content = boardEntity.content
        )
    }
}