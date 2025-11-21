import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.println("Prime Number Checker");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        boolean isPrime = true;

        if (a <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    isPrime = false;
                    break; // no need to check further
                }
            }
        }

        System.out.println(isPrime);
        sc.close();
    }
}
