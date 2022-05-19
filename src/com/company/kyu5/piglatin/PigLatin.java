package com.company.kyu5.piglatin;

public class PigLatin   {



    public static String pigIt(String str) {
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
                if (word.matches("[a-zA-Z]+")) {
                    sb.append(word.substring(1) + word.charAt(0) + "ay ");
                }else{
                    sb.append(word + " ");
                }
        }
        return sb.toString().trim();

    }
}
