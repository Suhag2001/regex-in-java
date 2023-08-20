package bootcoding;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {
    public static void main(String[] args) {

        String myText = "Welcome to Bootcoding";

        Pattern pattern = Pattern.compile("[a-z]");

        Matcher matcher = pattern.matcher(myText);

        while (matcher.find()){
            System.out.println(myText.substring(matcher.start(), matcher.end()));
        }


    }
}
