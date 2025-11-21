import java.util.*;
public class Wordcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int count = 0;
        String [] mysplit = input.split("\\s+");
        System.out.println(mysplit.length);
    }
    
}
