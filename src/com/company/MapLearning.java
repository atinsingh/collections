package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapLearning {
    public static void main(String[] args) {
        // Map<K,V>
        Map<Integer, String > map = new HashMap<>();
        // Key has be unique -- keys can't be duplicated
        map.put(101, "Hitesh");
        map.put(103, "Vivek");
        map.put(102, "Harsimaran");
        map.put(102, "Vivek");

        System.out.println(map.get(101));
        System.out.println(map.containsKey(11));
        System.out.println(map.containsValue("Hitesh"));

        System.out.println(map.keySet());
        System.out.println(map.values());

        map.putIfAbsent(110, "Rahul");

        map.compute(111, (k,v)-> v+"!");

        //System.out.println(map.remove(110));
        System.out.println(map.remove(110, "Rahul"));

        System.out.println(map);

        Map<String, Guest> guestMap = new HashMap<>();
     }
}
// key  == >  value

// 101 == >  Hitesh
//  102 == >  Harsiman

