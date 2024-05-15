package com.example.hexagonalarchitecture.board.application.service

import com.example.hexagonalarchitecture.board.adapter.`in`.web.BoardResponse
import com.example.hexagonalarchitecture.board.adapter.out.persistence.BoardRepository
import org.springframework.stereotype.Service

@Service
class BoardService(
    private val boardRepository: BoardRepository
) {
    fun getBoardByTitle(title: String): BoardResponse {
        val board = boardRepository.findByTitle(title)
            ?: throw IllegalArgumentException("게시판을 찾을 수 없습니다. title: $title")
        return BoardResponse(
            id = board.id,
            title = board.title,
            content = board.content
        )
    }
}