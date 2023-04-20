package edu.wctc;

/** Card class, creates a card object */
public class Card {
    private String face;
    private String suit;
    private int value;

    /** Constructor for the card object */
    public Card(String face, String suit, int value) {
        this.face = face;
        this.suit = suit;
        this.value = value;
    }

    public String getFace() {
        return face;
    }

    public String getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }
}
