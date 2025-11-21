import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rev = "";
        String input = sc.nextLine();
        for(int i = input.length()-1; i >= 0;i--){
            rev+=input.charAt(i);
        }
        if (input.equals(rev)){
            System.out.println("Yes");

        }else{
            System.out.println("Nahi h");
        }
        
    }
    
}
