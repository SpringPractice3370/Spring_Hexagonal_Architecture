package com.example.application.board.service

import com.example.application.board.dto.BoardResponse
import com.example.application.board.port.BoardCommand
import com.example.application.board.port.`in`.BoardUseCase
import com.example.application.board.port.out.BoardStatePort
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