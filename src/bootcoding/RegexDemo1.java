package bootcoding;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 {
    public static  void main(String[] args){

//        Pattern pattern = Pattern.compile("suhag mohinkar");
//        Pattern pattern = Pattern.compile("[abc]");
//        Pattern pattern = Pattern.compile("[a-z]");
//        Pattern pattern = Pattern.compile("[A-Z]");
//        Pattern pattern = Pattern.compile("[0-9]");
        Pattern pattern = Pattern.compile("[^abc]");

//        Matcher matcher =  pattern.matcher("suhag");
        Matcher matcher =  pattern.matcher("z");

        if(matcher.matches()){
            System.out.println("pattern match successfully");
        }else {
            System.out.println("Invalid Input");
        }

    }

}
