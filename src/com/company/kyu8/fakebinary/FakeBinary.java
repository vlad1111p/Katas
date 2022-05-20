package com.company.kyu8.fakebinary;

public class FakeBinary {

    public static String fakeBin(String numberString) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numberString.length(); i++) {
            if (Integer.parseInt(String.valueOf(numberString.charAt(i))) <5) {
                result.append("0");
            } else {
                result.append("1");
            }
        }
        return result.toString();
    }

    }
