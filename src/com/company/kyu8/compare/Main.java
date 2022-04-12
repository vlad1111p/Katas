package com.company.kyu8.compare;

import java.util.Arrays;

public class Main {

    static boolean betterThanAverage(final int[] classPoints, final int yourPoints) {
        return Arrays.stream(classPoints).average().orElse(0) < yourPoints;
    }
}
