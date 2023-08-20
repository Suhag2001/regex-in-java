package bootcoding;

public class RegexDemo4 {
    public static void main(String[] args) {
        String text = "Hello @world! How are you?";

        String replacedText = text.replaceAll("\\W", " ");

        System.out.println("Replaced Text: " + replacedText);
    }
}
