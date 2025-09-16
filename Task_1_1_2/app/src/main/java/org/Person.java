package org;

import java.util.List;
import java.util.ArrayList;

/**
 * class describing the player and the dealer.
 *
 */
public class Person{
    private List<Card> cards = new ArrayList<>();
    private int sum = 0;

    /**
     *method used to add cards to a Person's hand.
     */
    public void addCard(Pair<Integer, Integer> vals){
        Card addition = new Card();
        addition.setCard(vals.getFirst(), vals.getSecond());
        sum += addition.getValue();
        cards.add(addition);
    }

    private Card getCard(int ind){
        return cards.get(ind);
    }

    /**
     * method used to get hand in readable string representation.
     */
    public String getCards(){
        String out = "";
        for (int i = 0; i < cards.size(); i++){
            out += getCard(i).getCard();
            if (i != cards.size() - 1)
                out += " ";
        }
        return out;
    }

    /**
     * method used to get Person's sum of cards
     */
    public int getSum(){
        return sum;
    }
}
