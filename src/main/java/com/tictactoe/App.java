package com.tictactoe;

public class App {
    public static void main(String[] args) {
        System.out.println("¡Bienvenido al juego de Tic Tac Toe!");
        Board board = new Board();
        board.printBoard();
    }
}
