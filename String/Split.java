import java.util.*;
public class Split {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String [] mysplit = input.split("\\s+");
        for ( String i : mysplit){
            System.out.println(i);
        }
    }
    
}
