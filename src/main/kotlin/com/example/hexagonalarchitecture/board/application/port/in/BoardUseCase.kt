package com.example.hexagonalarchitecture.board.application.port.`in`

import com.example.hexagonalarchitecture.board.adapter.`in`.web.BoardResponse

interface BoardUseCase {
    fun getBoardByTitle(title: String): BoardResponse
}