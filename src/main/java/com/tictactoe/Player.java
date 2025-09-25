package com.tictactoe;
import java.util.Scanner;

public class Player {
    private char symbol;
    private Scanner scanner;

    public Player(char symbol, Scanner scanner) {
        this.scanner = scanner;
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public int[] playerTurn() {
        System.out.println("Turno: " + symbol);
        System.out.print("Selecciona una fila y una columna: ");
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        return new int[] { row, col };
    }
}