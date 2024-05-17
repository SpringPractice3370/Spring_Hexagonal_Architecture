package com.example.hexagonalarchitecture.board.application.port.`in`

import com.example.hexagonalarchitecture.board.adapter.`in`.web.BoardResponse
import com.example.hexagonalarchitecture.board.application.port.BoardCommand

interface BoardUseCase {
    fun getBoardByTitle(command: BoardCommand): BoardResponse
}