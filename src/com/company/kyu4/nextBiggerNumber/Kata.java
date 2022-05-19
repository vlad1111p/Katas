package com.company.kyu4.nextBiggerNumber;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Kata {

    public static long nextBiggerNumber(long n) {
        char[] digits = String.valueOf(n).toCharArray();


        for (int i = digits.length-1; i > 0; i--) {
            if (digits[i] > digits[i-1]) {
                int nBiggerIndex = i;
                for (int j = digits.length-1; j > i; j--) {
                    if (digits[j] > digits[i-1]) {
                        nBiggerIndex = j;
                        break;
                    }
                }
                char temp = digits[nBiggerIndex];
                digits[nBiggerIndex] = digits[i-1];
                digits[i-1] = temp;
                Arrays.sort(digits, i, digits.length);
                return Long.parseLong(new String(digits));
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(nextBiggerNumber(2017)); ;
    }
}

