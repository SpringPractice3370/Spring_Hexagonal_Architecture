package com.example.application.board.port.`in`

import com.example.application.board.dto.BoardResponse
import com.example.application.board.port.BoardCommand

interface BoardUseCase {
    fun getBoardByTitle(command: BoardCommand): BoardResponse
}