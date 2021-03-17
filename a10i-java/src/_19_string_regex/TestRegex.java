package _19_string_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {

    public static void main(String[] args) {

        // Regex, Quantifier
//        String strInput = "ac";
//        System.out.println(strInput.matches("[abc]?"));

        // Kiem tra dinh dang email
//        String emailInput = "234abc_3432@codegym.com";
//        System.out.println(emailInput.matches("[A-Za-z_0-9]+@(gmail|codegym).com"));
//        System.out.println(emailInput.matches("[\\w]+@(gmail|codegym).com"));

        String emailInput = "234abc_3432@codegym.com";
        Pattern pattern = Pattern.compile("[\\w]+@(gmail|codegym).com");
        Matcher matcher = pattern.matcher(emailInput);

        System.out.println(matcher.matches());
    }
}
