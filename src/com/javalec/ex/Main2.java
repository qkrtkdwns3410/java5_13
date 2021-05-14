package com.javalec.ex;

public class Main2 {
    public static void main(String[] args) {
        int[] iArr = {1, 2, 3};
    
        try {
            System.out.println("*******************");
            System.out.println(iArr[3]);
            System.out.println("==============");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("무조건 실행합니다");
        }
    }
}
