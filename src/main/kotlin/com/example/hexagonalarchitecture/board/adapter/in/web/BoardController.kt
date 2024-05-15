package com.example.hexagonalarchitecture.board.adapter.`in`.web

import com.example.hexagonalarchitecture.board.application.service.BoardService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BoardController(
    private val boardService: BoardService
) {
    @GetMapping("/v1/boards")
    fun getBoards() = boardService.getBoardByTitle("title")
}