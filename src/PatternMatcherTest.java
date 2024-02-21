import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PatternMatcherTest {
    private final PatternMatcherInterface match = new PatternMatcher();
    @Test
    public void testMatchWithWildCharCardInMiddle() {
        assertTrue(match.match("abc", "a?c"));
    }
    @Test
    public void testMatchWithStringWildCardInMiddle() {
        assertTrue(match.match("abc", "a*c"));
    }
    @Test
    public void testMatchWithStringWildCard() {
        assertTrue(match.match("abc", "*"));
    }


    @Test
    public void testMatchWithStringWildCardAtEnd() {
        assertTrue(match.match("abc", "a*"));
    }
    @Test
    public void testMatchWithStringWildCardAtBeginning() {
        assertTrue(match.match("abcf", "*cf"));
    }
    @Test
    public void testMatchWithoutWildCard() {
        assertTrue(match.match("abc", "abc"));
    }
    @Test
    public void testMatchWithInvalideParttern() {
        assertFalse(match.match("abc", "bc"));
    }
}