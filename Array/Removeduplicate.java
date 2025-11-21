package Array;
import java.util.Scanner;
public class Removeduplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer");
        int count = sc.nextInt();
        int[] arr = new int[count];
        for (int i = 0;i < count ;i++){
            arr [i] = sc.nextInt();
            
        }
        
        int[] temp = new int[count];
        for (int i = 0;i < count ;i++){
            temp[i] = arr[i];
            for(int j = 0;j<count-i;i++){
                if(arr[i] == arr[j]){

                }else{
                    temp[j] = arr[j];
                }
            }
            
            
        }
        
    }

}
