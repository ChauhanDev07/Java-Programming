import java.util.*;
public class Removewhitespaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().replaceAll("\\s+", "");

        System.out.println(input);        
    }
    
}
