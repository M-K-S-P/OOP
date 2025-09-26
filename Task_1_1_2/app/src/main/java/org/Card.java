package org;

/**
 * Class describing the Card objects.
 */
public class Card {

    private boolean open = false;
    private Rank rank;
    private Suit suit;

    /**
     * method necessary to create Card obj.
     *
     * @param setRank - card name.
     * @param setSuit - card suit.
     */
    public void setCard(int setRank, int setSuit) {
        rank = Rank.values()[setRank];
        suit = Suit.values()[setSuit];
    }

    /**
     * method used to get string representation of the Card object.
     */
    public String toString() {
        if (open == true) {
            return rank.toString() + " of " + suit.toString();
        } else {
            return "Card is closed";
        }
    }

    /**
     * open card.
     */
    public void openCard() {
        open = true;
    }

    /**
     * method used to get int value of the Card object.
     */
    public int getValue() {
        return rank.val;
    }

    private enum Rank {
        Ace(1), King(10), Queen(10), Jack(10), Ten(10), Nine(9), Eight(8), Seven(7), Six(6), Five(
            5), Four(4), Three(3), Two(2);
        public final int val;

        private Rank(int val) {
            this.val = val;
        }
    }

    private enum Suit {Diamonds, Hearts, Clubs, Spades}
}
