package org;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class GameTest {

    @Test
    void gameTestTie() {
        List<Card> cards = new ArrayList<Card>();
        cards.add(new Card(Card.Rank.Three, Card.Suit.Spades));
        cards.add(new Card(Card.Rank.Jack, Card.Suit.Hearts));
        cards.add(new Card(Card.Rank.Queen, Card.Suit.Diamonds));
        cards.add(new Card(Card.Rank.Seven, Card.Suit.Clubs));
        cards.add(new Card(Card.Rank.Two, Card.Suit.Spades));
        cards.add(new Card(Card.Rank.Six, Card.Suit.Spades));
        Deck newDeck = new Deck();
        newDeck.generateDeckFrom(cards);
        String simulated = "1\n0\n";
        Scanner scanner = new Scanner(simulated);
        Game.Status stat = Game.round(scanner, newDeck);
        assertTrue(stat == Game.Status.Tie);
    }

    @Test
    void gameTestWin() {
        List<Card> cards = new ArrayList<Card>();
        cards.add(new Card(Card.Rank.Three, Card.Suit.Spades));
        cards.add(new Card(Card.Rank.Jack, Card.Suit.Hearts));
        cards.add(new Card(Card.Rank.Queen, Card.Suit.Diamonds));
        cards.add(new Card(Card.Rank.Seven, Card.Suit.Clubs));
        cards.add(new Card(Card.Rank.Two, Card.Suit.Spades));
        cards.add(new Card(Card.Rank.Seven, Card.Suit.Spades));
        Deck newDeck = new Deck();
        newDeck.generateDeckFrom(cards);
        String simulated = "1\n0\n";
        Scanner scanner = new Scanner(simulated);
        Game.Status stat = Game.round(scanner, newDeck);
        assertTrue(stat == Game.Status.Won);
    }

    @Test
    void gameTestLost() {
        List<Card> cards = new ArrayList<Card>();
        cards.add(new Card(Card.Rank.Three, Card.Suit.Spades));
        cards.add(new Card(Card.Rank.Jack, Card.Suit.Hearts));
        cards.add(new Card(Card.Rank.Queen, Card.Suit.Diamonds));
        cards.add(new Card(Card.Rank.Seven, Card.Suit.Clubs));
        cards.add(new Card(Card.Rank.Two, Card.Suit.Spades));
        cards.add(new Card(Card.Rank.Four, Card.Suit.Spades));
        Deck newDeck = new Deck();
        newDeck.generateDeckFrom(cards);
        String simulated = "0\n";
        Scanner scanner = new Scanner(simulated);
        Game.Status stat = Game.round(scanner, newDeck);
        assertTrue(stat == Game.Status.Lost);
    }
}
