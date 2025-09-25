package com.tictactoe;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Bienvenido al juego de Tic Tac Toe!\nEl tablero se compone de fila 0 - 1 y 2 y de columna 0 - 1 y 2: ");
        Board board = new Board();        

        Player playerX = new Player('X', scanner);
        Player playerO = new Player('O', scanner);

        Game game = new Game(board, playerX, playerO);
        game.start();

        scanner.close();
    }
}
