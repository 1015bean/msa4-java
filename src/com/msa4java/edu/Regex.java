package com.msa4java.edu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {

        // String 객체 이용
        String str = "bean15";
        String pattern1 = "[a-zA-Z]+";
        String pattern2 = "[0-9]+";
        String pattern3 = "[a-z0-9]{6,20}";

        System.out.println(str.matches(pattern1));
        System.out.println(str.matches(pattern2));
        System.out.println(str.matches(pattern3));

        // Pattern 객체 이용
        Pattern pattern4 = Pattern.compile("[a-zA-Z]+");

        Matcher matcher4 = pattern4.matcher(str);

        System.out.println(matcher4.matches());
    }
}
