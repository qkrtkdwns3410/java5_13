package com.javalecextemp;

public class ThrowsExClass {
    public ThrowsExClass() {
        actionC();
    }
    private void actionA() throws Exception {
        System.out.println("actionA");
    
        int[] iArr = {1, 2, 3, 4};
        System.out.println(iArr[4]);
    
        System.out.println("actionAA");
        
    }
    private void actionB(){
        System.out.println("actionB");
        try {
            actionA();
        } catch (Exception e) {
            System.out.println("예외는 여기서 처리");
            System.out.println(e.getMessage());
        }
    }
    
    private void actionC() {
        System.out.println("actionC");
        actionB();
        System.out.println("actionCC");
    }
}
