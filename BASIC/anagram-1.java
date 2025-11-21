import java.util.*;
public class reverse{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.nextLine().toLowerCase().replaceAll("[$#@]","");
        String b = sc.nextLine().toLowerCase().replaceAll("[$#@]","");
        int la = a.length();
        int lb = b.length();
        if(la!=lb){
            System.out.print("Not Anagram");
        }else{
            char arr1[] = a.toCharArray();
            char arr2[] = b.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if(Arrays.equals(arr1,arr2)){
                System.out.print("Anagram");
                
            }else{
                System.out.print("Not Anagram");
            }
            
        }
    }
}
