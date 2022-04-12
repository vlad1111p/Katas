package com.company.Kyu6.detectPangram;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static boolean check(String sentence) {

        Map<Character, Integer> map = new HashMap<>();
        for (char ch = 'a'; ch <= 'z'; ++ch)
            map.put(ch, 0);
        sentence = sentence.toLowerCase(Locale.ROOT);
        char[] chars = sentence.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            map.put(chars[i], 1 );
        }
        if (map.containsValue(0)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(check("The quick brown fox jumps over the lazy dog."));
    }
}
