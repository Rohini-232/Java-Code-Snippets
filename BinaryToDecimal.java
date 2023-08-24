import java.util.*;

public class BinaryToDecimal{
    public static void BinToDec(int BiNum){
        int MyNum =BiNum;
        int power=0;
        int decimal=0;
        
        while(BiNum>0){
            int LD= BiNum %10;
            decimal = decimal +(LD * (int) Math.pow(2,power));
            power++;
            BiNum = BiNum /10;
        }
        System.out.println("Decimal of " +MyNum + " = " +decimal);
    }

 public static void main(String args[]){
    BinToDec(110);
 }
}