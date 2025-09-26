package org;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/*
 * Sanity check.
 */
public class SanityTest {

    @Test
    void sanity() {
        assertTrue(true);
    }

    @Test
    void cardTest(){
        Card card = new Card();
        card.setCard(0, 0);
        card.openCard();
        assertTrue(card.toString() == "Ace of Diamonds");
        assertTrue(card.getValue() == 1);
    }

    @Test
    void personCheck() {
        Person person = new Person();
        Card card = new Card();
        card.setCard(0, 0);
        person.addCard(card);
        person.openHand();
        assertTrue(person.getHand() == "Ace of Diamonds");
        assertTrue(person.getSum() == 1);
    }
}

