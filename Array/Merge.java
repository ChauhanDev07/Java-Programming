package Array;

import java.util.Scanner;

public class Merge {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter INT");
        int count = sc.nextInt();
        int[] num = new int[count];
        System.out.println("Enter INT arr2");
        int count2 = sc.nextInt();
        int[] arr1 = new int[count2];
        int[] arr2 = new int[count + count2];

        System.out.println("Enter arr1 Element");
        for (int i = 0;i<count;i++){
            num[i] = sc.nextInt();
            arr2[i] = num[i];
            

        }
        System.out.println("Enter arr2 Element");
        for (int i = 0;i<count2;i++){
            arr1[i] = sc.nextInt();
            
        }
        for (int i = 0; i < count2; i++) {
            arr2[count + i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
         sc.close();

    }
    
}
