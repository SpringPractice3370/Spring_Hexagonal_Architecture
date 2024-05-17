package com.example.hexagonalarchitecture.board.application.service

import com.example.hexagonalarchitecture.board.adapter.`in`.web.BoardResponse
import com.example.hexagonalarchitecture.board.application.port.`in`.BoardUseCase
import com.example.hexagonalarchitecture.board.application.port.out.BoardPort
import org.springframework.stereotype.Service

@Service
class BoardService(
    private val boardPort: BoardPort
): BoardUseCase {
    override fun getBoardByTitle(title: String): BoardResponse {
        val board = boardPort.findByTitle(title)
            ?: throw IllegalArgumentException("게시판을 찾을 수 없습니다. title: $title")
        return BoardResponse(
            id = board.id,
            title = board.title,
            content = board.content
        )
    }
}