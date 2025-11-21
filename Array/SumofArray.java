package Array;
import java.util.Scanner;
public class SumofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer");
        int count = sc.nextInt();
        int[] arr = new int[count];
        for (int i = 0;i < count ;i++){
            arr [i] = sc.nextInt();
            
        }
        int sum = 0;
        for (int i = 0;i < count ;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }

}
