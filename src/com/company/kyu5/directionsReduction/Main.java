package com.company.kyu5.directionsReduction;

import java.util.HashMap;
import java.util.Map;
//TODO
public class Main {

    public static String[] dirReduc(String[] arr) {

        Map<String,Integer> map=new HashMap<>();
        map.put("NORTH",0);
        map.put("SOUTH",0);
        map.put("EAST",0);
        map.put("WEST",0);
        for (String a:arr){
            map.put(a, map.get(a) + 1);
        }
        if(map.values().stream().reduce(0, Integer::sum)%4==0){
            return new String[] {};
        }
        if(map.get("NORTH")==map.get("SOUTH")){
            if (map.get("EAST")>map.get("WEST")){

                return new String[] {"EAST"};
            }else{
                return new String[] {"WEST"};
            }
        }
        if(map.get("EAST")==map.get("WEST")){
            if (map.get("NORTH")>map.get("SOUTH")){

                return new String[] {"NORTH"};
            }else{
                return new String[] {"SOUTH"};
            }
        }
        return new String[] {};
    }
}
