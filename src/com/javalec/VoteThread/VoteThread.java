package com.javalec.VoteThread;

import java.util.Random;

public class VoteThread implements Runnable {
    int targetNum = 100;
    int sum = 0;
    Random random = new Random();
    
    @Override
    public void run() {
    
    
        StringBuffer sb = new StringBuffer();
    
        while (true) {
            sum += random.nextInt(10);
            sb.delete(0, sb.toString().length()); //sb초기화
    
            if (sum >= targetNum) { //100보다 크면 ..
                sum = 100;                  //100으로 세팅합니다.
                for (int i = 0; i < sum; i++) { //
                    sb.append('*');
                }
                System.out.println(Thread.currentThread().getName() + "개표율 : " + sum + "\t : " + sb);
                //\t 는 탭이랍니다.
                break; //100보다 크면 스탑해야지
            } else {
                for (int i = 0; i < sum; i++) {
                    sb.append("*");
                }
                System.out.println(Thread.currentThread().getName() + "개표율 : " + sum + "\t: " + sb);
            }
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            
            }
        }
    }
}

