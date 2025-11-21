package Array;
import java.util.Scanner;
public class Pairsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer");
        int count = sc.nextInt();
        int[] arr = new int[count];
         int target = 10;
        for (int i = 0;i < count ;i++){
            arr [i] = sc.nextInt();
            
        }
        
         for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + target);
                }
            }
        }
        
    }

}
