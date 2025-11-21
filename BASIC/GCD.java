import java.util.*;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // first number
        int b = sc.nextInt(); // second number

        while (b != 0) {
            int temp = b;   // store current b
            b = a % b;      // remainder becomes new b
            a = temp;       // old b becomes new a
        }

        System.out.println("" + a + "," + b + "");
    }
}
