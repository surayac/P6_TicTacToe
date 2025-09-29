package com.tictactoe;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BoardTest {

    private Board board;

    @BeforeEach
    void setup() {
        board = new Board();
    }

    @Test
    void testShould_Return_True_When_Line_Is_Filled() {
        board.placeMark(0, 1, 'O');
        board.placeMark(1, 1, 'O');
        board.placeMark(2, 1, 'O');

        assertTrue(board.hasWinner('O'));
    }

    @Test
    void testShould_Return_True_When_Column_Is_Filled() {}

}
