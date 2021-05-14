package com.javalec.button;

import com.javalec.thread.ThreadTest;

import java.awt.*;

public class MainClass {
    public static void main(String[] args) {
        MakeBtn btn = new MakeBtn();
        btn.pack(); //크기를 정하는 함수
//        btn.setSize(new Dimension(200,200)); //가로200 세로 200으로 버튼 크기를 정합니다.
        btn.setVisible(true); //버튼을 화면에 출력합니다.
    
        try {
            Thread.sleep(2000);
        } catch (Exception e) {}
        btn.setVisible(false); //버튼을 화면에서 출력하지 않습니다.
        btn.dispose();  //자원 해제
    
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        
        }
        System.exit(0);
    }
    
}
