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
        assertTrue(card.toString().equals("Ace of Diamonds"));
         assertTrue(card.getValue() == 1);
    }

    @Test
    void deckTest(){
        Deck deck = new Deck();
        deck.generateDeck();
    }

    @Test
    void personTest() {
        Person person = new Person();
        Card card = new Card();
        card.setCard(0, 0);
        person.addCard(card);
        person.openHand();
        assertTrue(person.getHand().equals("Ace of Diamonds"));
        assertTrue(person.getSum() == 1);
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

