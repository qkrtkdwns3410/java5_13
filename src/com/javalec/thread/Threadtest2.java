package com.javalec.thread;

public class Threadtest2 implements Runnable {
    int testNum = 0;
    
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (Thread.currentThread().getName().equals("A")) {
                System.out.println("============================");
                testNum++;
            }
            System.out.println("ThreadName: " + Thread.currentThread().getName() + ", testNum : " + testNum);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            
            }
        }
    }
}
