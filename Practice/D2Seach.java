package practice;

public class D2Seach {
    public static void main(String[] args) {
        
        int matrix[][] = { 
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 9} };
        boolean symmetric = true;
        for(int i = 0; i < matrix.length;i++){
            for(int j = 0; j<matrix.length;j++){
                if(matrix[i][j] != matrix[j][i]){

                    symmetric = false;
                break;
                }  // <-- this semicolon ends the if
            }
            if(!symmetric) break;
        }
        
        System.out.println(symmetric);
}
        
}
