package bootcoding;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexDemo5 {
    public static void main(String[] args) {
        try {
            // Invalid regular expression pattern
            String patternString = "()";

            // Attempt to compile the pattern
            Pattern pattern = Pattern.compile(patternString);

            // This line won't be reached if a PatternSyntaxException is thrown
            System.out.println("Pattern compiled successfully.");
        } catch (PatternSyntaxException e) {
            System.err.println("Pattern syntax exception: " + e.getMessage());
        }
    }
}
