package Array;
import java.util.Scanner;
public class Missingnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer");
        int count = sc.nextInt();
        int[] arr = new int[count];
        for (int i = 0;i < count ;i++){
            arr [i] = sc.nextInt();   
        }
        
        for (int j = 0;j < count ;j++){
            if(arr[j]==j+1){
            }else{
                System.out.println(j);
            }

        }
        
    }

}
