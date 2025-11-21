import java.util.*;
public class facts{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int fact = 1;
        int num = sc.nextInt();
        for(int i = 1;i<num+1;i++){
            fact*=i;
        }

        System.out.println(fact);

    }
}
