package com.company.kyu5.gapinprimes;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(gap(4, 100, 110)));
        System.out.println(Arrays.toString(gap(10, 300, 400)));
        System.out.println(Arrays.toString(gap(6, 100, 110)));

    }

    public static long[] gap(int g, long m, long n) {
        long[] longArray = new long[2];
        for (long i = m; i <= n; i++) {
            if (isPrime(i)) {
                longArray[0] = i;
                for (long v = longArray[0] + 1; v <= n; v++) {
                    if (isPrime(v) && v - longArray[0] == g) {
                        boolean checker = true;
                        for (long b = longArray[0] + 1; b < v; b++) {
                            if (isPrime(b)) {
                                checker = false;
                                break;
                            }
                        }
                        if (checker) {
                            longArray[1] = v;
                            return longArray;
                        }
                    }
                }
            }
        }

        return null;
    }

    static boolean isPrime(long number) {
        for (long j = 2; j <= number / 2; j++) {
            if (number % j == 0) {
                return false;
            }
        }
        return true;
    }

}
