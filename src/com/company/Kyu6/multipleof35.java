package com.company.Kyu6;

public class multipleof35 {

    public int solution(int number) {
        int n=0;
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                n=n+i;
            }
        }
        return n;
    }
}
