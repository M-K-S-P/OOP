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
    public Card(Rank setRank, Suit setSuit) {
        this.rank = setRank;
        this.suit = setSuit;
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

    public static enum Rank {
        Ace(1), King(10), Queen(10), Jack(10), Ten(10), Nine(9), Eight(8), Seven(7), Six(6), Five(
            5), Four(4), Three(3), Two(2);
        public final int val;

        Rank(int val) {
            this.val = val;
        }
    }

    public static enum Suit { Diamonds, Hearts, Clubs, Spades }
}
