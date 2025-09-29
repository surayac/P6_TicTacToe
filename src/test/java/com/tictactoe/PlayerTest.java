package com.tictactoe;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

public class PlayerTest {
    private Player player;
    private Scanner fakeScanner;

    @BeforeEach
    void setUp() {
        fakeScanner = new Scanner("1 2");
        player = new Player('X', fakeScanner);
    }

    @AfterEach
    void tearDown() {
        fakeScanner.close();
        player = null;
    }

    @Test
    void testGetSymbol_to_check_if_symbol_is_assignated_to_player() {
        assertEquals('X', player.getSymbol());
    }

    @Test 
    void testGetColor() {
        Scanner fakeScanner = new Scanner ("");
        Player player = new Player('X', fakeScanner);

        String color = player.getColor();

        assertEquals("\033[0;35m", color);
    }
}
