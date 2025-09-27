package org;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import org.junit.jupiter.api.Test;

public class GameTest {

    @Test
    void gameTest() {
        String simulated = "1\n1\n1\n0\n0\n";
        Deck newDeck = new Deck();
        Scanner scanner = new Scanner(
            new ByteArrayInputStream(simulated.getBytes(StandardCharsets.UTF_8)));
        Game.Status stat = Game.round(scanner, newDeck);
        assert (stat == Game.Status.Lost | stat == Game.Status.Won | stat == Game.Status.Tie);
    }
}
