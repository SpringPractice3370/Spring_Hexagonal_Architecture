package com.example.hexagonalarchitecture.board.application.service

import com.example.hexagonalarchitecture.board.adapter.`in`.web.BoardResponse
import com.example.hexagonalarchitecture.board.application.port.BoardCommand
import com.example.hexagonalarchitecture.board.application.port.`in`.BoardUseCase
import com.example.hexagonalarchitecture.board.application.port.out.BoardStatePort
import org.springframework.stereotype.Service

@Service
class BoardService(
    private val boardStatePort: BoardStatePort
): BoardUseCase {
    override fun getBoardByTitle(command: BoardCommand): BoardResponse {
        val board = boardStatePort.findByTitle(BoardCommand(title = command.title))
            ?: throw IllegalArgumentException("게시판을 찾을 수 없습니다. title: ${command.title}")
        return BoardResponse(
            id = board.id,
            title = board.title,
            content = board.content
        )
    }
}