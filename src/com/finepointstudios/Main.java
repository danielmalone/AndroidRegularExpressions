package com.finepointstudios;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String text = "Hi! How are you doing today?";
        Pattern p = Pattern.compile("[A-z]+");
        Matcher m = p.matcher(text);
        while (m.find()) {
            System.out.println("Found: " + m.group());
        }
    }
}
