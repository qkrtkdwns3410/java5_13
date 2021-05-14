package com.javalec.hashSet;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("str0");
        hashSet.add("str1");
        hashSet.add("str2");
        hashSet.add("str3");
        hashSet.add("str2");
        System.out.println(hashSet.toString());
    
        hashSet.remove("str0");
        System.out.println(hashSet.toString());
    
        int i = hashSet.size();
        System.out.println("사이즈 : " + i);
        
        
    }
}
