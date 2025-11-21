import java.util.*;
public class reverse{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();          
        String rev = new StringBuilder(input)   
                        .reverse()              
                        .toString();            
        System.out.println(rev);                
    }
}
