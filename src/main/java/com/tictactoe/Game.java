package com.tictactoe;

public class Game {
    private Board board;
    private Player playerX;
    private Player playerO;
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String RED = "\u001B[31m";
    public static final String RESET = "\033[0m";

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
                    System.out.println(GREEN + "¡Jugador " + current.getSymbol() + " gana!" + RESET);
                    playing = false;
                } else if (board.isFull()) {
                    board.printBoard();
                    System.out.println(RED + "¡Empate!" + RESET);
                    playing = false;
                } else {
                    current = (current == playerX) ? playerO : playerX;
                }
            } else {
                System.out.println(YELLOW + "Esta casilla está ocupada, intenta otra vez." + RESET);
            }
        }
    }
};
