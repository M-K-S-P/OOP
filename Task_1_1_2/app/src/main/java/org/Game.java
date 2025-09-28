package org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Class containing main structure of the game.
 */
public class Game {

    private static int roundCounter = 0;

    protected static Status round(Scanner sc, Deck newDeck) {
        Status stat = Status.Lost;
        System.out.println("round " + roundCounter);
        roundCounter += 1;
        int cardCounter = 5;
        Person user = new Person();
        user.addCard(newDeck.fetchCard(0));
        user.addCard(newDeck.fetchCard(1));
        user.openHand();
        System.out.println("Your cards: " + user.getHand());
        System.out.println("Your sum: " + user.getSum());
        Person dealer = new Person();
        dealer.addCard(newDeck.fetchCard(2));
        dealer.addCard(newDeck.fetchCard(3));
        dealer.addCard(newDeck.fetchCard(4));
        dealer.openCard(0);
        dealer.openCard(1);
        System.out.println("Dealer's first card: " + dealer.getHand());
        int step = 1;
        while (step != 0) {
            System.out.println("1 for open next card, 0 for fold:");
            step = sc.nextInt();
            if (step == 1) {
                Card addition = newDeck.fetchCard(cardCounter);
                addition.openCard();
                user.addCard(addition);
                System.out.println("New card: " + addition.toString());
                System.out.println("Your sum: " + user.getSum());
                if (user.getSum() > 21) {
                    System.out.println("You lost");
                    return stat;
                }
                cardCounter += 1;
            }
        }
        dealer.openHand();
        System.out.println("Dealer's cards: " + dealer.getHand());
        System.out.println("Dealer's sum: " + dealer.getSum());
        if (dealer.getSum() > 21) {
            stat = Status.Won;
        } else if (dealer.getSum() < user.getSum()) {
            stat = Status.Won;
        } else if (dealer.getSum() == user.getSum()) {
            stat = Status.Tie;
        }
        return stat;
    }

    /**
     * method necessary to start the game.
     *
     * @param args - cmd arguments, none handled.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deck newDeck = new Deck();
        int flag = 1;
        while (flag == 1) {
            newDeck.generateDeck();
            newDeck.deckShuffle();
            Status stat = round(sc, newDeck);
            System.out.println(stat.toString());
            System.out.println("want to play again? Press 1");
            flag = sc.nextInt();
        }
        sc.close();
    }

    public static enum Status {
        Won, Lost, Tie;
    }

}
