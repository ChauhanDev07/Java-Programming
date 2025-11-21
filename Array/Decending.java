package Array;
import java.util.Scanner;

public class Decending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int count = sc.nextInt();
        int[] arr = new int[count];

        System.out.println("Enter " + count + " integers:");
        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }

        // Bubble Sort
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array (Ascending):");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
