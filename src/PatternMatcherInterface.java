@FunctionalInterface
public interface PatternMatcherInterface {
    /**
     * Check if the text matches the pattern.
     *
     * @param text    The text to be matched.
     * @param pattern The pattern to be matched.
     * @return True if the text matches the pattern, false otherwise.
     */
    boolean match(String text, String pattern);
}