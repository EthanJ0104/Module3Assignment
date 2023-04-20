package edu.wctc;
import edu.wctc.Card;
import org.junit.Before;
import org.junit.Test;
import edu.wctc.Game;
import static org.junit.Assert.assertTrue;
public class GameTest {
    private Card[] hand;

    @Before
    public void setUp() {
        hand = new Card[] {new Card("Jack", "Club", 11), new Card("Five", "Club", 5), new Card("Jack", "Spade", 11)};
    }

    @Test
    public void twoOfAKindTest() {
        assertTrue(Game.twoOfAKind(hand));
    }

    @Test
    public void threeOfAKindTest() {
        assertTrue(Game.threeOfAKind(hand));
    }

    @Test
    public void fourOfAKindTest() {
        assertTrue(Game.fourOfAKind(hand));
    }

    @Test
    public void flushTest() {
        assertTrue(Game.flush(hand));
    }
}
