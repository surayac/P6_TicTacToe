package com.tictactoe;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
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
<<<<<<< HEAD

    @Test
    void testGetColor_to_check_playerX_color() {
        assertEquals("\033[0;35m", player.getColor());
    }

    @Test
    void testPlayerTurn() {
        assertArrayEquals(new int[] { 1, 2 }, player.playerTurn());
    }

    @Test
    void testPlayerOColor() {
        Player playerO = new Player('O', new Scanner("0\n0\n"));
        assertEquals('O', playerO.getSymbol());
        assertEquals("\033[0;36m", playerO.getColor());
    }
}
=======
    @Test 
    void testGetColor() {
        Scanner fakeScanner = new Scanner ("");
        Player player = new Player('X', fakeScanner);

        String color = player.getColor();

        assertEquals("\033[0;35m", color);
    }
}
>>>>>>> e183fd556c484b57fd0967eb81e013988af0ab61
