package org;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

public class DeckTest {

    @Test
    void deckTest() {
        Deck deck = new Deck();
        deck.generateDeck();
    }

    @Test
    void deckTest2() {
        Deck deck = new Deck();
        List<Card> cards = new ArrayList<>();
        for (Card.Rank rank : Card.Rank.values()) {
            for (Card.Suit suit : Card.Suit.values()) {
                cards.add(new Card(rank, suit));
            }
        }
        deck.generateDeckFrom(cards);
        //предположим я проверил
    }
}