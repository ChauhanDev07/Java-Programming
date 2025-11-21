import java.util.*;
public class Easysort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Easy sort using built-in method
        Arrays.sort(arr);

        // Output sorted array
        System.out.println("Sorted array:");
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
