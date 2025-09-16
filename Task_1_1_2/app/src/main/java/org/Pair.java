package org;

/**
 * Class describing a pair structure.
 */
public final class Pair<A,B> {
    private final A first;
    private final B second;

    /**
     * method used to set values to the pair object.
     */
    public Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    /**
     * get first element.
     */
    public A getFirst() { return first; }


    /**
     * get second element.
     */
    public B getSecond() { return second; }
}

