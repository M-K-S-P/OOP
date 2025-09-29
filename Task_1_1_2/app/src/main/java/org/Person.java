package org;

import java.util.ArrayList;
import java.util.List;

/**
 * class describing the player and the dealer.
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

    /**
     * opens card by index.
     *
     * @param ind - index in question.
     */
    public void openCard(int ind) {
        cards.get(ind).openCard();
    }

    /**
     * opening cards made easy.
     */
    public void openHand() {
        for (int i = 0; i < cards.size(); i++) {
            openCard(i);
        }
    }

    private String getCard(int ind) {
        return cards.get(ind).toString();
    }

    /**
     * method used to get hand in readable string representation.
     */
    public String getHand() {
        int count = cards.size();
        String out = "";
        for (int i = 0; i < count; i++) {
            out += getCard(i);
            if (i != count - 1) {
                out += ", ";
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
