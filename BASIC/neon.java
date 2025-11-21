
    
import java.util.*;

public class neon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int sq = num*num;
        int sum = 0;
        while(sq>0){
            int temp = sq % 10;
            sum += temp;
            sq /= 10;
        }
        if(sum == num){
            System.out.println("Yes");
        }else{
            System.out.println("no");
        }
    }
}
