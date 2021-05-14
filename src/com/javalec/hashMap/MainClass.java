package com.javalec.hashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainClass {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(0, "atr0");
        hashMap.put(1, "atr1");
        hashMap.put(2, "atr2");
        hashMap.put(3, "atr3");
        hashMap.put(4, "atr4");
        System.out.println(hashMap.toString());
    
        Set<Integer> set = hashMap.keySet();
        Iterator<Integer> iterator = set.iterator();
    
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            System.out.println(key + " : " + hashMap.get(key));
        }
    }
}
