package practice;

public class row {
    public static void main(String[] args){
        int arr[][] = {
            {1,2,3},
            {2,3,9},
            {3,4,5}
        };
        int col = arr[0].length;
        for (int j = 0;j<col;j++){
            int sum = 0;
            
            for(int i=0;i<arr.length;i++){
                sum += arr[i][j];

            }
            System.out.println("Sum of Colum "+j+" is "+sum+"");
           
            
        }
         
    }

    
}
