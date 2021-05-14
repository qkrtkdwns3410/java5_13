import java.awt.event.ActionListener;

public class Millis {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("A");
        long startNum1 = System.currentTimeMillis();
    
        for (int i = 0; i < 50000; i++) {
            stringBuilder = stringBuilder.append("A");
        }
    
        long endNum1 = System.currentTimeMillis();
        System.out.println("경과 기간: " + (endNum1 - startNum1));
        }
}
