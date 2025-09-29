package org;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    void personTest() {
        Person person = new Person();
        Card card = new Card(Card.Rank.Ace, Card.Suit.Diamonds);
        person.addCard(card);
        person.openHand();
        assertTrue(person.getHand().equals("Ace of Diamonds"));
        assertTrue(person.getSum() == 1);
    }
}