package Array;
import java.util.Scanner;
public class Rotatearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer");
        int count = sc.nextInt();
        int[] arr = new int[count];
        for (int i = 0;i < count ;i++){
            arr [i] = sc.nextInt();  
        }
        int last = arr[count-1];
        for (int i = count - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;

        System.out.println("Array after rotation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
             
        }
        
}


