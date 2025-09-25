package com.tictactoe;

import java.util.Scanner;

public class Player {
    private String color;
    public static final String RESET = "\033[0m";

    private char symbol;
    private Scanner scanner;

    public Player(char symbol, Scanner scanner) {
        this.scanner = scanner;
        this.symbol = symbol;

        if (symbol == 'X') {
            this.color = "\033[0;35m";
        } else {
            this.color = "\033[0;36m";
        }
    }

    public char getSymbol() {
        return symbol;
    }

    public String getColor() {
        return color;
    }

    public int[] playerTurn() {
        System.out.println(color + "\nTurno: " + symbol + RESET);
        System.out.print("\nSelecciona una fila y una columna: ");
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        return new int[] { row, col };
    }
}