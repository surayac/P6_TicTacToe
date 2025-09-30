package com.tictactoe;

import static org.junit.jupiter.api.Assertions.assertFalse;
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
    void testShould_Return_True_When_Column_Is_Filled() {
        board.placeMark(0, 1, 'O');
        board.placeMark(1, 1, 'O');
        board.placeMark(2, 1, 'O');

        assertTrue(board.hasWinner('O'));
    }

    @Test
    void testShould_Return_True_When_Row_Is_Filled() {
        board.placeMark(0, 0, 'X');
        board.placeMark(0, 1, 'X');
        board.placeMark(0, 2, 'X');

        assertTrue(board.hasWinner('X'));
    }

      @Test
    void should_Return_True_When_Diagonal_Is_Filled() {
        board.placeMark(0, 0, 'X');
        board.placeMark(1, 1, 'X');
        board.placeMark(2, 2, 'X');

        assertTrue(board.hasWinner('X'));
    }

    @Test
    void should_Return_False_When_No_Winner() {
        board.placeMark(0, 0, 'X');
        board.placeMark(0, 1, 'O');
        board.placeMark(0, 2, 'X');

        assertFalse(board.hasWinner('X'));
        assertFalse(board.hasWinner('O'));
    }
}

