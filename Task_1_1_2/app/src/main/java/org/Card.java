package org;

/**
 * Class describing the Card objects.
 */
public class Card {

    private enum Names {
        Ace(1), King(10), Queen(10), Jack(10), Ten(10), Nine(9), Eight(8), Seven(7), Six(6), Five(
            5), Four(4), Three(3), Two(2);
        public final int val;

        private Names(int val) {
            this.val = val;
        }
    }

    ;

    private enum Suits { Diamonds, Hearts, Clubs, Spades }

    ;
    private int name;
    private int suit;

    /**
     * method necessary to create Card obj.
     *
     * @param setName - card name.
     * @param setSuit - card suit.
     */
    public void setCard(int setName, int setSuit) {
        name = setName;
        suit = setSuit;
    }

    /**
     * method used to get string representation of the Card object.
     */
    public String getCard() {
        return Names.values()[name].toString() + " of " + Suits.values()[suit].toString();
    }

    /**
     * method used to get int value of the Card object.
     */
    public int getValue() {
        return Names.values()[name].val;
    }
}
