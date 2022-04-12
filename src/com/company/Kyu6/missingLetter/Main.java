package com.company.Kyu6.missingLetter;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static char findMissingLetter(char[] array)
    {

        int counter=0;
        for (char ch = array[0]; ch <= array[array.length-1]; ++ch){
            if(ch==array[counter])
                counter++;
            else{
                return ch;
            }
        }
        return ' ';
    }
}
