package com.company.kyu5.validParanthesis;

public class Main {

    public static boolean validParentheses(String parens) {
        char[] chars = parens.toCharArray();
        int j = 0;
        if (chars[0] == ')') {
            return false;
        }
        for (int i = 0; i < chars.length; i++) {
            if (j == 0 && chars[i] == ')') {
                return false;
            }
            if (chars[i] == ')') {
                j--;
            }
            if (chars[i] == '(') {
                j++;
            }
        }
        return j==0;
    }
}
