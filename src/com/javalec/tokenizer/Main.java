package com.javalec.tokenizer;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        String str1 = "오늘 날씨는 춥고, 눈이 많이 오고 있습니다.";
        String str2 = "2014/12/25";
    
        System.out.println(str1);
        System.out.println(str2);
    
        StringTokenizer tokenizer1 = new StringTokenizer(str1);
        StringTokenizer tokenizer2 = new StringTokenizer(str2,"/");
    
        while (tokenizer1.hasMoreTokens()) {
            System.out.println(tokenizer1.nextToken());
        }
        while (tokenizer2.hasMoreTokens()) {
            System.out.println(tokenizer2.nextToken());
        }
    
    
        
    }
}
