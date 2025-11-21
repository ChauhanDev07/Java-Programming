package practice;

public class transpose {
    public static void main(String[] args){
        int mat[][] = {
            {1,2,3},
            {2,4,3},
            {3,4,4}
        };
        int second[][] = new int[mat.length][mat.length]; 
        for (int i = 0; i <mat.length;i++){
            for(int j = 0; j< mat.length;j++){
                second[i][j] = mat[j][i];

            }
        }
        for(int k = 0;k<mat.length;k++){
            for (int h = 0; h<mat.length;h++){
                
                System.out.print(second[k][h]);
                
            }
            System.out.println(" ");
        }
        


        }
    }
    
