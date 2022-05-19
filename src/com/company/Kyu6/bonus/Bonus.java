package com.company.Kyu6.bonus;

class Bonus {
    public static long[] bonus(int[] arr, long s) {
        long[] ls = new long[arr.length];
        double sm = 0.0;
        for (int i = 0; i < arr.length; i++)
            sm += 1.0 / (double)arr[i];
        for (int i = 0; i < arr.length; i++)
            ls[i] = (long)Math.round((double)s / (sm * (double)arr[i]));
        return ls;
    }
}