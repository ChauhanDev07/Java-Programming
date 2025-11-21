package Array;
import java.util.*;
public class Index {
    public static void main(String[] args){
        int[] arr = {3, 6, 1, 8, 5, 4}; 
int[] result = new int[arr.length]; 
int even = 0, odd = 1; 
for (int num : arr) { 
    if (num % 2 == 0) { 
        result[even] = num; 
        even += 2; 
    } else { 
        result[odd] = num; 
        odd += 2; 
    } 
} 
System.out.println(Arrays.toString(result)); 

    }

    
}
