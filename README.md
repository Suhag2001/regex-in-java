# Introduction to Regular Expressions (Regex) in Java

Regular expressions, often abbreviated as regex or rejex, are powerful tools for pattern matching and manipulation of strings. In Java, the `java.util.regex` package provides a set of classes for working with regular expressions.

## Key Points:

### 1. **Pattern Class:**
   - The `Pattern` class in Java represents a compiled regular expression. It provides methods for creating and manipulating regex patterns.
   - Example:
     ```java
     import java.util.regex.Pattern;
     Pattern pattern = Pattern.compile("ab+c");
     ```

### 2. **Matcher Class:**
   - The `Matcher` class is used to match a pattern against a given input string. It is obtained by calling the `matcher()` method on a `Pattern` object.
   - Example:
     ```java
     import java.util.regex.Matcher;
     Matcher matcher = pattern.matcher("abbbc");
     ```

### 3. **Common Regex Patterns:**
   - **a. Simple Characters:**
     - `a` matches the character 'a'.
   - **b. Quantifiers:**
     - `+` matches one or more occurrences of the preceding character or group.
     - `*` matches zero or more occurrences.
     - `?` matches zero or one occurrence.
   - **c. Character Classes:**
     - `[aeiou]` matches any vowel.
     - `[^0-9]` matches any non-digit.
   - **d. Anchors:**
     - `^` asserts the start of a line.
     - `$` asserts the end of a line.

### 4. **Predefined Character Classes:**
   - `\d` matches any digit (equivalent to `[0-9]`).
   - `\w` matches any word character (alphanumeric + underscore).
   - `\s` matches any whitespace character.

### 5. **Grouping and Capturing:**
   - Parentheses `()` are used for grouping and capturing subexpressions. The captured groups can be referenced later.
   - Example:
     ```java
     String input = "apple banana cherry";
     Pattern pattern = Pattern.compile("(\\w+) (\\w+)");
     Matcher matcher = pattern.matcher(input);
     if (matcher.find()) {
         System.out.println("Group 1: " + matcher.group(1)); // Output: apple
         System.out.println("Group 2: " + matcher.group(2)); // Output: banana
     }
     ```

### 6. **Regex in String Class:**
   - The `String` class in Java provides methods for working with regular expressions directly, like `matches()`, `replaceAll()`, and `split()`.
   - Example:
     ```java
     String input = "Hello,123,World";
     String[] parts = input.split("\\d+"); // Splits at digits
     ```

Regular expressions in Java offer a flexible and powerful way to handle string patterns, making them invaluable for tasks such as validation, searching, and manipulation of textual data.
