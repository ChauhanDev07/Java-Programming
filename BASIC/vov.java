import java.util.*;
public class reverse{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vov=0;
        int cons =0;
        String input = sc.nextLine().replace("\\s+","").toLowerCase();
        for(int i = 0;i<input.length();i++){
            if(input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u'){
                vov++;
            }else{
                cons++;
                
            }
            
        }
        System.out.print(vov);
        System.out.print(cons);
                      
    }
}
