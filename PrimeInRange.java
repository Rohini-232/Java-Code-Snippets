import java.util.*;

public class PrimeInRange{

    public static boolean isPrime(int n){
        boolean isPrime=true;
        for(int i=2; i<=n-1; i++){
            if(n % i==0){
                isPrime=false;
               
            }
        }
        return isPrime;
    }

    public static void PrimeNum(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                System.out.println(i+" ");
            }
        }
        System.out.println();
    }

    public static void main(String args[]){
        PrimeNum(20);
    }
}