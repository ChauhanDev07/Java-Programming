package Array;    
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer");
        int count = sc.nextInt();
        
        int[] arr = new int[count];
        
        
        for (int i = 0;i < count ;i++){
            arr [i] = sc.nextInt();
            
        }
        for (int i = count-1 ;i >= 0 ;i--){

            System.out.println(arr[i]);
        }

    }
   
}
