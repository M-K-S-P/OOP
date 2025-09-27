package org;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Scanner;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;

public class gameTest {

    @Test
    void gameTest() {
        String simulated = "1\n1\n1\n0\n0\n";
        Scanner scanner = new Scanner(
            new ByteArrayInputStream(simulated.getBytes(StandardCharsets.UTF_8)));
        Game game = new Game();
        Game.status stat = game.round(scanner);
        assertTrue(true); //round ended successfully
    }
}
