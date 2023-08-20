package bootcoding;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo3 {
    public  static  void main(String[] args){

//        String input = "bootcoding46654";
//          String input = "98745632108";
        String input = "Suha55g@2001";
//        Pattern pattern = Pattern.compile("[a-zA-z]|[0-9]+");
//        Pattern pattern = Pattern.compile("\\w+\\d+");
//        Pattern pattern = Pattern.compile("[987]{2}\\d{8}\\s\\d");
//        Pattern pattern = Pattern.compile("[A-Z]\\[a-z]+\\W\\d+");

        Pattern pattern = Pattern.compile("[a-z]+\\W\\");


        Matcher matcher = pattern.matcher(input);

        if(matcher.matches()){
            System.out.println("pattern matched successfully");
        }else {
            System.out.println("Invalid inputs");
        }
    }

}
