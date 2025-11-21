import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int original = num;
        int total = 0;
        
        int digitsCount = String.valueOf(num).length(); // number of digits
        
        while (num > 0) {
            int digit = num % 10;  // extract last digit
            total += Math.pow(digit, digitsCount); // digit^count
            num /= 10; // remove last digit
        }
        
        if (total == original) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
