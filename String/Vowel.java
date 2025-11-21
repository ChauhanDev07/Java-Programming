import java.util.*;
public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rev = "";
        int v = 0;
        int c = 0;
        String input = sc.nextLine().toLowerCase();
        for(int i = 0; i < input.length();i++){
            if (input.charAt(i) == 'a' ||input.charAt(i) == 'e' ||input.charAt(i) == 'i' ||input.charAt(i) == 'o' ||input.charAt(i) == 'u'){
                v++;

            }else{
                c++;
            }
        }
        System.out.println("Vowel="+v+",Consonant="+c+"");
    }
    
}
