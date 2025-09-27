package org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Deck class represents deck generator.
 */
public class Deck {

    private List<Card> newDeck;

    /**
     * Card fetcher.
     */
    public Card fetchCard(int ind) {
        return newDeck.get(ind);
    }

    /**
     * Deck generator itself.
     */
    public void generateDeck() {
        newDeck = new ArrayList<>();
        for (Card.Rank rank: Card.Rank.values()) {
            for (Card.Suit suit: Card.Suit.values()) {
                Card newCard = new Card(rank, suit);
                newDeck.add(newCard);
            }
        }
        Collections.shuffle(newDeck);
    }

}
