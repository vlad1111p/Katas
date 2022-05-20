package com.company.Kyu7.SumofthefirstnthtermofSeries;

public class NthSeries {

    public static String seriesSum(int n) {
        if (n == 1) {
            return "1.00";
        }
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / (i * 3 - 2);
        }
        return String.format("%.2f", sum);
    }

}

