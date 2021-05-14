import java.util.Random;
import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        double d = (int)(Math.random()*10+1);
        System.out.println(d);
    
        Random random = new Random();
        int i = random.nextInt(100);
        System.out.println(i);
    
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        System.out.println("str1 : "+str1);
    
        String str2 = scanner.nextLine();
        System.out.println("str2 : "+str2);
        
        
    }
}
