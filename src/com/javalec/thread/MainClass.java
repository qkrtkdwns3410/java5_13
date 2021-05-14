package com.javalec.thread;

public class MainClass {
    public static void main(String[] args) {
        Threadtest2 threadtest2 = new Threadtest2();
        Threadtest2 threadtest3 = new Threadtest2();
        
        Thread thread0 = new Thread(threadtest2, "A");
        Thread thread1 = new Thread(threadtest3, "B");
        
        thread0.start();
        thread1.start();
    
        System.out.println(Thread.currentThread().getName());
        System.out.println("MainClass");
    }
}
