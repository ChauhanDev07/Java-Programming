package Array;
import java.util.*;
public class Odd {
    public static void main(String[] args) {
        System.out.println("Enter The Integer");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int [] arr = new int[count];
        for(int i = 0;i<count;i++){
             arr[i] = sc.nextInt();
        }
        for (int i = 0;i<count;i++){
            if(arr[i] % 2 !=0){
                System.out.println(arr[i]);
            }

        }

        
    }
    
}

