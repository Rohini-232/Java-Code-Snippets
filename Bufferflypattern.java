import java.util.*;
public class Bufferflypattern{
    public static void Pattern(int n){

        //1st half
        for(int i=1; i<=n; i++){

            //for star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //for space
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            //for star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //for 2nd half
        for(int i=n; i>=1; i--){

            //for star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }  

            //for space
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            //for star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Pattern(6);
    }
}