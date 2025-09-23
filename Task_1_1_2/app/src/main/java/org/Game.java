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
    private static Deck newDeck = new Deck();

    private static void generateSequence() {
        newDeck.generateDeck();
    }

    private static void round(Scanner sc) {
        System.out.println("round " + roundCounter);
        roundCounter += 1;
        int cardCounter = 5;
        generateSequence();
        Person user = new Person();
        user.addCard(newDeck.fetchCard(0));
        user.addCard(newDeck.fetchCard(1));
        System.out.println("Your cards: " + user.getHand(0));
        System.out.println("Your sum: " + user.getSum());
        Person dealer = new Person();
        dealer.addCard(newDeck.fetchCard(2));
        dealer.addCard(newDeck.fetchCard(3));
        System.out.println("Dealer's first card: " + dealer.getHand(1));
        int step = 1;
        while (step != 0) {
            System.out.println("1 for open next card, 0 for fold:");
            step = sc.nextInt();
            if (step == 1) {
                user.addCard(newDeck.fetchCard(cardCounter));
                System.out.println("Your cards: " + user.getHand(0));
                System.out.println("Your sum: " + user.getSum());
                if (user.getSum() > 21) {
                    System.out.println("You lost");
                    return;
                }
                cardCounter += 1;
            }
        }
        dealer.addCard(newDeck.fetchCard(4));
        System.out.println("Dealer's cards: " + dealer.getHand(0));
        System.out.println("Dealer's sum: " + dealer.getSum());
        if (dealer.getSum() > 21) {
            System.out.println("You won");
            return;
        } else if (dealer.getSum() > user.getSum()) {
            System.out.println("You lost");
        } else if (dealer.getSum() < user.getSum()) {
            System.out.println("You won");
        } else {
            System.out.println("Tie");
        }
    }

    /**
     * method necessary to start the game.
     *
     * @param args - cmd arguments, none handled.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag = 1;
        while (flag == 1) {
            round(sc);
            System.out.println("want to play again? Press 1");
            flag = sc.nextInt();
        }
        sc.close();
    }

}
