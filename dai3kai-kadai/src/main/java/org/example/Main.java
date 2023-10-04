package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> userAge = new HashMap<>();
        userAge.put("takahashi", 20);
        userAge.put("ueda", 23);
        userAge.put("sakashita", 25);
        userAge.put("sasaki", 27);
        userAge.put("yamaguchi", 29);

        String key = "yamashita";
        try {
            int value = userAge.get(key);
            System.out.println(key + " is " + value + "years old.");
        } catch (NullPointerException e) {
            System.out.println(key + " is " + "not found.");
        }

    }
}