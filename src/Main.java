public class Main {
    public static void main(String[] args) {
        PatternMatcherInterface matcher = new PatternMatcher();

        System.out.println(matcher.match("abc", "a?c"));   // true
        System.out.println(matcher.match("abc", "a*c"));   // true
        System.out.println(matcher.match("abc", "*"));     // true
        System.out.println(matcher.match("abc", "a*"));    // true
        System.out.println(matcher.match("abcf", "*c"));    // true
        System.out.println(matcher.match("abc", "bc"));    // false
        System.out.println(matcher.match("", "bc"));    // false
        System.out.println(matcher.match("", ""));    // false

    }

}

