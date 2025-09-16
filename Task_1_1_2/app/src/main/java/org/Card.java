package org;

/**
 * Class describing the Card objects.
 */
public class Card {

    private static final String[] names = {"Ace", "King", "Queen", "Jack", "10", "9", "8", "7", "6",
        "5", "4", "3", "2"};
    private static final String[] suits = {" of diamonds", " of hearts", " of clubs", " of spades"};
    private static final int[] values = {1, 10, 10, 10, 10, 9, 8, 7, 6, 5, 4, 3, 2};
    private int name;
    private int suit;

    /**
     * method necessary to create Card obj.
     */
    public void setCard(int setName, int setSuit) {
        name = setName;
        suit = setSuit;
    }

    /**
     * method used to get string representation of the Card object.
     */
    public String getCard() {
        return names[name] + suits[suit];
    }

    /**
     * method used to get int value of the Card object.
     */
    public int getValue() {
        return values[name];
    }
}
