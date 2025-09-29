package com.tictactoe;

import java.util.Scanner;

public class Player {
    private String color;
    public static final String YELLOW = "\u001B[33m";
    public static final String BRIGHT_RED = "\u001B[91m";
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
        int row, col;
        do {
            try {
                System.out.println(color + "\nTurno: " + symbol + RESET);
                System.out.print(YELLOW + "\nSelecciona una fila y una columna (0-2, ej.: 1 1): " + RESET);
                row = scanner.nextInt();
                col = scanner.nextInt();

                if (row >= 0 && row <= 2 && col >= 0 && col <= 2)
                    break;
                System.out.println(BRIGHT_RED + "Error: los números deben estar entre 0 y 2." + RESET);

            } catch (java.util.InputMismatchException e) {
                System.out.println(BRIGHT_RED + "Error: debes ingresar números enteros." + RESET);
                scanner.nextLine();
                row = -1;
                col = -1;
            }

        } while (true);
        return new int[] { row, col };
    }
}