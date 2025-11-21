import java.util.*;

public class Strong {
    // factorial method
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original = num;

        int len = String.valueOf(num).length();
        int[] arr = new int[len];

        // store digits
        for (int i = 0; i < len; i++) {
            int digit = num % 10;
            arr[len - 1 - i] = digit;  
            num /= 10;
        }

        // calculate sum of factorial of digits
        int sum = 0;
        for (int j = 0; j < len; j++) {
            sum += factorial(arr[j]);
        }
        if(sum==original){
            System.out.println("Yes Strong");
        }else{
            System.out.println("No");
        }
    }
}
