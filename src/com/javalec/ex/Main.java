package com.javalec.ex;

public class Main {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        System.out.println(i * j);
    
        try {
            System.out.println(i / j);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
