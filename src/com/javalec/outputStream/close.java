package com.javalec.outputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class close {
    public static void main(String[] args) {
        OutputStream os = null;
    
        try {
            File file;
            os = new FileOutputStream("C:\\Users\\ipeac\\IdeaProjects\\javaout.txt");
            String str = "오늘 날씨는 아주 좋습니다.";
            byte[] bs = str.getBytes();
            os.write(bs);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                if(os!=null) os.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
