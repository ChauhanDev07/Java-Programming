package method;

public class prime {
    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for (int i  =2 ; i<=Math.sqrt(n);i++){
            if(n%i == 0){
                return false;
            }
            

        }
        return true;
        
        }
        public static void main(String[] args){
            System.out.print(isPrime(3));
            System.out.println(isPrime(7));
    }
    
}
