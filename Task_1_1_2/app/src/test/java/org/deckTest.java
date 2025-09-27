package org;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class deckTest {

    @Test
    void deckTest() {
        Deck deck = new Deck();
        deck.generateDeck();
    }
}