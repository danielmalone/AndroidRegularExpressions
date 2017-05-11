package com.finepointstudios;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String text = "Hi! How are you doing today? Are you going to the zoo today? I am not!";
        Pattern p = Pattern.compile("[A-Za-z]+");
        Matcher m = p.matcher(text);

        // data above
        while (m.find()) {
            System.out.println("Found: " + m.group());
        }
    }
}
