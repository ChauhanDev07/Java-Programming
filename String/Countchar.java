import java.util.*;
public class Countchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
       char need = sc.nextLine().charAt(0);
        int feq = 0;
        
        for(int i = 0;i<input.length();i++){
            if(input.charAt(i)== need){
                feq++;
            }
        }
        System.out.println(feq);
        
    }
    
}
