import java.util.*;

public class DecimalToBinary{
    public static void DeciToBin(int n){
        int Mynum=n;
        int Power=0;
        int BiNum=0;

        while(n>0){
           int rem= n % 2;
            BiNum= BiNum + (rem * (int)Math.pow(10,Power));
            Power++;
            n=n/2;
        }
        System.out.println("Binary of " + Mynum + "=" +BiNum);
    }

    public static void main(String args[]){
        DeciToBin(5);
    }
}