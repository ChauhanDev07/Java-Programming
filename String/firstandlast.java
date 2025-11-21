import java.util.*;
public class firstandlast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int k = input.length();
        char first = input.charAt(0);
        char second = input.charAt(k-1);
        System.out.println(""+first+","+second+"");
        

    }
    
}
