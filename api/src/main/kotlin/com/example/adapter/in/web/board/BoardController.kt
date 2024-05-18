package com.example.adapter.`in`.web.board

import com.example.application.board.port.BoardCommand
import com.example.application.board.port.`in`.BoardUseCase
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