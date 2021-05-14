package com.javalec.timetask;

import java.util.Timer;
import java.util.TimerTask;

public class TimerEx {
    public TimerEx() throws InterruptedException {
    
        System.out.println("^^");
        Timer timer = new Timer(true); // true설정하지 않는다면,, 프로그램이 끝날때까지 계속 돌아감.
        TimerTask t1 = new ExTimerTask1();
        TimerTask t2 = new ExTimerTask2();
    
        timer.schedule(t1, 2000); //2초후 실행
        timer.schedule(t2, 10000); //10초후 실행
    
        Thread.sleep(11000);
        System.out.println("**");
    }
}
