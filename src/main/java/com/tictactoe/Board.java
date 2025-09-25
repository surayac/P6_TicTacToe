package com.tictactoe;

public class Board {
    private char[][] board;

    public Board() {
        board = new char[3][3];
        clear();
    }

    public void clear() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                board[i][j] = ' ';
    }

    public void printBoard() {
        System.out.println("El tablero se compone de fila 0 - 1 y 2 y de columna 0 -1 y 2: ");
        for (int i = 0; i < 3; i++) {
            System.out.println("\t _ _ _");
            System.out.print(" ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean placeMove(int line, int column, char player) {
        if (board[line][column] == ' ') {
            board[line][column] = player;
            return true;
        }
            return false;
    }
};
