import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rev = "";
        String input = sc.nextLine();
        for(int i = input.length()-1; i >= 0;i--){
            rev+=input.charAt(i);
        }
        System.out.println(rev);
    }
    
}
