package com.example.application.board.port.out

import com.example.application.board.port.BoardCommand
import com.example.domain.board.Board

interface BoardStatePort {
    fun findByTitle(command: BoardCommand): Board?
}