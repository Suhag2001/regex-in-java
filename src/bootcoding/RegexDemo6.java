package bootcoding;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo6 {
    public static void main(String[] args) {

            // Regular expression pattern with a group
            String regex = "(\\w+)";
            String input = "Hello World!";

            // Compile the pattern
            Pattern pattern = Pattern.compile(regex);

            // Create a Matcher object
            Matcher matcher = pattern.matcher(input);

            // Check if the pattern matches the input string
            if (matcher.find()) {
                // Get the group count
                int groupCount = matcher.groupCount();
                System.out.println("Group count: " + groupCount);

                // Access the captured group
                String group = matcher.group(1);
                System.out.println("Group 1: " + group);

        }
    }
}
