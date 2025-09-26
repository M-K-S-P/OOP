package org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Deck class represents deck generator.
 */
public class Deck {

    private static List<Card> newDeck;

    /*
     * Card fetcher.
     */
    public static Card fetchCard(int ind) {
        return newDeck.get(ind);
    }

    /*
     * Deck generator itself.
     */
    public void generateDeck() {
        newDeck = new ArrayList<>();
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 4; j++) {
                Card newCard = new Card();
                newCard.setCard(i, j);
                newDeck.add(newCard);
            }
        }
        Collections.shuffle(newDeck);
    }

}
