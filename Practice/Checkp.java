package practice;

public class Checkp {
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,4};
        boolean yes = true;
        for (int i =0;i<arr.length/2;i++){
            if(arr[i] != arr[arr.length-1-i] ){
                yes = false;
                break;

            }
            
            
        }
        System.out.println(yes);

    }


    
}
