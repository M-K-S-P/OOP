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
     * Generates base 52 card deck
     */
    public void generateDeck() {
        newDeck = new ArrayList<>();
        for (Card.Rank rank : Card.Rank.values()) {
            for (Card.Suit suit : Card.Suit.values()) {
                Card newCard = new Card(rank, suit);
                newDeck.add(newCard);
            }
        }
    }

    /**
     * Shuffles the deck.
     */
    public void deckShuffle() {
        Collections.shuffle(newDeck);
    }

    /**
     * generates deck from card list.
     *
     * @param cards - card list
     */
    public void generateDeckFrom(List<Card> cards) {
        newDeck = new ArrayList<>();
        for (Card card : cards) {
            newDeck.add(card);
        }
    }

}
