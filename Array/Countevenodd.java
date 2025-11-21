package Array;
import java.util.*;
public class Countevenodd {
    public static void main(String[] args) {
        System.out.println("Enter The Integer");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int total = 0;
        int odd = 0;
        int [] arr = new int[count];
        for(int i = 0;i<count;i++){
             arr[i] = sc.nextInt();
        }
        for (int i = 0;i<count;i++){
            if(arr[i] % 2 ==0){
                total += 1;
            }else{
                odd += 1;
            }

        }
        System.out.println("Even "+total);
        System.out.println("odd "+odd);


        
    }
    
}

