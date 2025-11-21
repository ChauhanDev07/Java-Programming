package practice;

public class identity {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int k = 0;
        int result[] = new int[arr.length];
        for (int i = 0;i<arr.length;i++){
           k+=arr[i];
           result[i]=k;
        }
        for (int j = 0;j<arr.length;j++){
            System.out.println(result[j]);
        }
        
    }
}