public class StringBulider {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("abcdefg");
    
        stringBuilder.append("higjfj");
        System.out.println(stringBuilder);
    
        stringBuilder.insert(3, "AAA");
        System.out.println(stringBuilder);
    
        stringBuilder.delete(3, 5);
        System.out.println(stringBuilder);
    
        stringBuilder.deleteCharAt(10);
        System.out.println(stringBuilder);
        
    }
}
