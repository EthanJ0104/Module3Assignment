package edu.wctc;

import java.util.Arrays;

/**
 * This is a utility class consisting of static methods to determind if a hand matches a specific poker hand
 * @author Ethan Jaworski
 * @version 1.0
 */
public class Game {
    /**
     *
     * @param hand An Array of Cards
     * @return True if there are two of a kind and false if not
     */
    public static boolean twoOfAKind(Card[] hand) {
        Arrays.sort(hand, (a, b) -> a.getFace().compareTo(b.getFace()));
        int numberOfMatches = 0;
        for (int i = 0; i < hand.length-1; i++) {
            if (hand[i].getFace().equals(hand[i+1].getFace())) return true;
        }
        return false;
    }

    public static boolean threeOfAKind(Card[] hand) {
        int matches = 0;
        for (int i = 0; i < hand.length; i++) {
            if (hand[i].getValue() == hand[i + 1].getValue()) {
                matches++;
            }
        }

        if (matches >= 3) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean fourOfAKind (Card[] hand) {
        int matches = 0;
        for (int i = 0; i < hand.length; i++) {
            if (hand[i].getValue() == hand[i + 1].getValue()) {
                matches++;
            }
        }

        if (matches >= 4) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean flush (Card[] hand) {
        int matches = 0;
        for (int i = 0; i < hand.length; i++) {
            if (hand[i].getSuit() == hand[i + 1].getSuit()) {
                matches++;
            }
        }

        if (matches == 5) {
            return true;
        }
        else {
            return false;
        }
    }
}
