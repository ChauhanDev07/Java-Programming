package Array;
import java.util.Scanner;
public class Searchelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer");
        int count = sc.nextInt();
        System.out.println("What to seach in array");
        int search = sc.nextInt();
        int[] arr = new int[count];
        
        for (int i = 0;i < count ;i++){
            arr [i] = sc.nextInt();
            
        }
        for (int i = 0;i < count ;i++){
            if (arr[i] == search){
                System.out.println("Found at index "+i+"");
            }
        }
    }
  
}