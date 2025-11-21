package Array;
import java.util.Scanner;
public class SecondLargest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer");
        int count = sc.nextInt();
        int[] arr = new int[count];
        for (int i = 0;i < count ;i++){
            arr [i] = sc.nextInt();
            
        }
        int maxi = 0;
        int max = arr[0];
        for (int i = 1;i < count ;i++){
            if (arr[i] > max){
                maxi = i;
            }    
        }
        arr[maxi] = 0;
        int second = arr[0];
        int maxii = 0;
        for (int j = 1;j < count ;j++){
            if (arr[j] > second){
                maxii = j;
            }    
        }
        System.out.println(maxii);
        
    }

    
}

