import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().toLowerCase();
        int[] freq = new int[256];

        // count frequency
        for (int i = 0; i < a.length(); i++) {
            freq[a.charAt(i)]++;
        }

        // print frequency in correct way
        for (int j = 0; j < 256; j++) {
            if (freq[j] != 0) {
                System.out.print((char) j + "" + freq[j] + " ");
            }
        }
    }
}
