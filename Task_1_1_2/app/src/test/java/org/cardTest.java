package org;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class cardTest {

    @Test
    void cardTest() {
        Card card = new Card(Card.Rank.Ace, Card.Suit.Diamonds);
        card.openCard();
        assertTrue(card.toString().equals("Ace of Diamonds"));
        assertTrue(card.getValue() == 1);
    }

    @Test
    void gameTest() {
        //final byte[] input = "".getBytes();
        //final ByteArrayInputStream inStream = new ByteArrayInputStream(input);
        //System.setIn(inStream);
        //Game game = new Game();
        assertTrue(true);
    }
}

