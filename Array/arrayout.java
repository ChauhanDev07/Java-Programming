package Array;

import java.util.Scanner;

public class arrayout {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter INT");
        int count = sc.nextInt();
        int[] num = new int[count];

        
        for (int i = 0;i<count;i++){
            num[i] = sc.nextInt();
            
        }
        for (int i = 0;i<count;i++){
            System.out.println(num[i]);
            
        }
         sc.close();

    }
    
}
