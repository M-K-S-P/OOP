package org;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class DeckTest {

    @Test
    void deckTest() {
        Deck deck = new Deck();
        deck.generateDeck();
        deck.deckShuffle();
        Set<String> cardString = new HashSet<String>();
        Card card;
        for (int i = 0; i < 52; i++){
            card = deck.fetchCard(i);
            card.openCard();
            cardString.add(card.toString());
        }
        assertTrue(cardString.size() == 52);
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
        for (int i = 0; i < cards.size(); i++) {
            assertTrue(cards.get(i) == deck.fetchCard(i));
        }
    }
}