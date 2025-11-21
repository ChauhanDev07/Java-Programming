package Array;
import java.util.Scanner;
public class Rotatearrayleft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer");
        int count = sc.nextInt();
        int[] arr = new int[count];
        for (int i = 0;i < count ;i++){
            arr [i] = sc.nextInt();  
        }
        int first = arr[0];                  // store the first element
for (int i = 0; i < count - 1; i++) { // shift everything left
    arr[i] = arr[i + 1];
}
arr[count - 1] = first;              // put the first element at the end

        System.out.println("Array after rotation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }     
        }
        
}


