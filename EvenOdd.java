import java.util.*;
public class EvenOdd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int A=sc.nextInt();

        if(A%2==0){
            System.out.println("The number is Even");
        }
        else{
            System.out.println("Number is Odd");
        }

    }
}