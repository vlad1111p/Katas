package com.company.Kyu6.sortOdd;


import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class Main {

    public static int[] sortArray(int[] array) {
        List<Integer> arrayList =new ArrayList<>();

        for(int i=0;i<array.length;i++){
            if(array[i]%2!=0){
            arrayList.add(array[i]);
            }
        }
        Collections.sort(arrayList);
        int j=0;
        System.out.println();
        for (int i=0;i<array.length;i++){
            if(array[i]%2!=0){
                array[i]=arrayList.get(j);
                j++;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(sortArray(new int[]{ 5, 3, 1, 8, 0 }));
    }
}
