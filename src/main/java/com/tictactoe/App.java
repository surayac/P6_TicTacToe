package com.tictactoe;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Bienvenido al juego de Tic Tac Toe!");
        Board board = new Board();
        board.printBoard();

       Player playerX = new Player('X', scanner);
       Player playerO = new Player('O', scanner);

       
        scanner.close();
    }
}
