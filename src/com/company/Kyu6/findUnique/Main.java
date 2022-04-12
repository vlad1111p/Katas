package com.company.Kyu6.findUnique;

public class Main {

    public static double findUniq(double arr[]) {
        if(arr[0]!=arr[1]&&arr[0]!=arr[2]){
            return arr[0];
        }
        if(arr[1]!=arr[0]&&arr[1]!=arr[2]){
            return arr[1];
        }
        if(arr[2]!=arr[0]&&arr[2]!=arr[1]){
            return arr[2];
        }
        double commonNumber=arr[0];

        for (int i = 3; i < arr.length; i++) {
            if(arr[i]!=commonNumber){
                return arr[i];
            }

        }
        return 1;
    }
}
