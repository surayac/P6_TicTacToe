package com.tictactoe;

public class Game {
    private Board board;
    private Player playerX;
    private Player playerO;

    public Game(Board board, Player playerX, Player playerO) {
        this.board = board;
        this.playerX = playerX;
        this.playerO = playerO;
    }

    public void start() {
        boolean playing = true;
        Player current = playerX;

        while (playing) {
            board.printBoard();
            int[] move = current.playerTurn();
            int row = move[0];
            int col = move[1];

            if (board.isEmpty(row, col)) {
                board.placeMark(row, col, current.getSymbol());

                if (board.hasWinner(current.getSymbol())) {
                    board.printBoard();
                    System.out.println("¡Jugador " + current.getSymbol() + " gana!");
                    playing = false;
                } else if (board.isFull()) {
                    board.printBoard();
                    System.out.println("¡Empate!");
                    playing = false;
                } else {
                    current = (current == playerX) ? playerO : playerX;
                }
            } else {
                System.out.println("Esta casilla está ocupada, intenta otra vez.");
            }
        }
    }
};
