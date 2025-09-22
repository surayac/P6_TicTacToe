package com.tictactoe;

public class Board {
    char[][] board = {
            { ' ', ' ', ' ' },
            { ' ', ' ', ' ' },
            { ' ', ' ', ' ' }
    };

    public void printBoard() {
        System.out.println("Tablero vacío:");
        for (int i = 0; i < 3; i++) {
            System.out.println("-------------");
            System.out.print(" ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-------------");
    }
};
