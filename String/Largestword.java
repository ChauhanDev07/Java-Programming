import java.util.*;

public class Largestword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();
        String[] mysplit = input.split("\\s+"); 
        String largest = "";
        int highest = 0;
        for (int i = 0; i < mysplit.length; i++) {
            String w = mysplit[i];
            int len = w.length();
            

            if (len > highest) {
                highest = len;
                largest = w;
            }
        }
        System.out.println("Largest word: " + largest);
        System.out.println("Length: " + highest);
    }
}
