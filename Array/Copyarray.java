package Array;
import java.util.Scanner;
public class Copyarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer");
        int count = sc.nextInt();
        int[] arr = new int[count];
        int[] arr2 = new int[count];
        for (int i = 0;i < count ;i++){
            arr [i] = sc.nextInt();
            
        }
        
        for (int i = 0;i < count ;i++){
            arr2[i] = arr[i]; 
        }
        System.out.print("Copied ");
        for (int i = 0;i < count ;i++){
           System.out.print(arr2[i]);
        }
        
    }

}