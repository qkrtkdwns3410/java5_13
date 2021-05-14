package com.javalec;

import jdk.internal.org.objectweb.asm.TypeReference;

import java.io.FileInputStream;
import java.io.InputStream;

public class inputStream {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("C:\\Users\\ipeac\\IdeaProjects\\test001.txt");
            while (true) {
                int i = is.read();
                System.out.println("데이터 : " + i);
                if (i == -1) {
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}
