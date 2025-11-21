package Array;

import java.util.Scanner;

public class countocc {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer");
        int count = sc.nextInt();
        System.out.println("What to seach in array");
        int search = sc.nextInt();
        int[] arr = new int[count];
        int total = 0;
        System.out.println("Enter Array");
        for (int i = 0;i < count ;i++){
            arr [i] = sc.nextInt();
            
        }
        for (int i = 0;i < count ;i++){
            if (arr[i] == search){
                total += 1;
            }
        }
        System.out.println(total);

    }
    
    
  
}