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
                board[i][j] = '_';
    }

    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            System.out.print("\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean placeMark(int line, int column, char symbol) {
        if (board[line][column] == '_') {
            board[line][column] = symbol;
            return true;
        }
        return false;
    }

    public boolean hasWinner(char symbol) {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) ||
                    (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol)) {
                return true;
            }
        }
        if ((board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) ||
                (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)) {
            return true;
        }

        return false;
    }

    public boolean isFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '_')
                    return false;
            }
        }
        return true;
    }

    public boolean isEmpty(int row, int col) {
        return board[row][col] == '_';
    }
};
