package com.javalec.ex2;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.HashMap;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(0, "str0");
        hashMap.put(1, "str1");
        hashMap.put(2, "str2");
        hashMap.put(3, "str3");
        hashMap.put(4, "str4");
        
        System.out.println(hashMap.toString());
        
        hashMap.remove(2);
        System.out.println(hashMap.toString());
        
        hashMap.clear();
        System.out.println(hashMap.toString());
        
        hashMap.put(0, "str1");
        hashMap.put(1, "str2");
        hashMap.put(2, "str3");
        hashMap.put(3, "str4");
        
        Iterator<Integer> iterator = hashMap.keySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(hashMap.get(iterator.next()));
        }
    }
}
