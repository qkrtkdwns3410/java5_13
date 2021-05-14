package com.javalec.outputStream;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("C:\\Users\\ipeac\\IdeaProjects\\javaout.txt");
            String str = "오늘 날씨는 아주 좋습니다.";
            byte[] bs = str.getBytes();
            os.write(bs);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

