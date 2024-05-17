package com.example.hexagonalarchitecture.board.adapter.`in`.web

import com.example.hexagonalarchitecture.board.application.port.BoardCommand
import com.example.hexagonalarchitecture.board.application.port.`in`.BoardUseCase
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BoardController(
    private val boardUseCase: BoardUseCase
) {
    @GetMapping("/v1/boards")
    fun getBoards() = boardUseCase.getBoardByTitle(
        command = BoardCommand(title = "title")
    )
}