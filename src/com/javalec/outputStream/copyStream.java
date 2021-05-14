package com.javalec.outputStream;

import java.io.*;

public class copyStream {
    public static void main(String[] args) {
        InputStream is = null;
        OutputStream os = null;
        
        try {
            File file;
            is = new FileInputStream("C:\\Users\\ipeac\\IdeaProjects\\javaout.txt");
            os = new FileOutputStream("C:\\Users\\ipeac\\IdeaProjects\\javacopy.txt");
            
            while (true) {
                int i = is.read();
                if (i == -1) break;
                os.write(i);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (Exception e2) {
                    System.out.println(e2.getMessage());
                }
            }
            if (os != null) {
                try {
                    os.close();
                } catch (Exception e3) {
                    System.out.println(e3.getMessage());
                }
            }
        
        }
    }
}
