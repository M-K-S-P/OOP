package org;

import java.util.ArrayList;
import java.util.List;

/**
 * class describing the player and the dealer.
 *
 */
public class Person {

    private List<Card> cards = new ArrayList<>();
    private int sum = 0;

    /**
     * method used to add cards to a Person's hand.
     */
    public void addCard(Card newCard) {
        sum += newCard.getValue();
        cards.add(newCard);
    }

    public String getCard(int ind) {
        return cards.get(ind).getCard();
    }

    /**
     * method used to get hand in readable string representation.
     */
    public String getHand(int amount) {
        int count = cards.size();
        String out = "";
        if (amount != 0) {
            count = amount;
        }
        for (int i = 0; i < count; i++) {
            out += getCard(i);
            if (i != count - 1) {
                out += " ";
            }
        }
        return out;
    }

    /**
     * method used to get Person's sum of cards.
     */
    public int getSum() {
        return sum;
    }
}
