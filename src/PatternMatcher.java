public class PatternMatcher implements PatternMatcherInterface {
    @Override
    public boolean match(String text, String pattern) {
        return findMatch(text, pattern, 0, 0);
    }
    private boolean findMatch(String text, String pattern, int textIndex, int patternIndex) {
        if (textIndex == text.length() && patternIndex == pattern.length()) {
            return true;
        }
        if (patternIndex == pattern.length()) {
            return false;
        }
        if (pattern.charAt(patternIndex) == '?' || (textIndex < text.length() && text.charAt(textIndex) == pattern.charAt(patternIndex))) {
            return findMatch(text, pattern, textIndex + 1, patternIndex + 1);
        }
        if (pattern.charAt(patternIndex) == '*') {
            return findMatch(text, pattern, textIndex, patternIndex + 1) ||
                    (textIndex < text.length() && findMatch(text, pattern, textIndex + 1, patternIndex));
        }
        return false;
    }

}
