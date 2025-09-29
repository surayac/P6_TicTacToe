package com.tictactoe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

public class PlayerTest {

    @Test
    void testGetSymbol() {
        Scanner fakeScanner = new Scanner ("");
        Player player = new Player('X', fakeScanner);

        char symbol = player.getSymbol();
    
        assertEquals('X', symbol, "Symbol should be X");
    }
    @Test 
    void testGetColor() {
        Scanner fakeScanner = new Scanner ("");
        Player player = new Player('X', fakeScanner);

        String color = player.getColor();

        assertEquals("\033[0;35m", color);
    }
}
