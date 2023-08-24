import java.util.*;

public class AddFunction{

    public static int Add(int a, int b){
       int sum=a+b;
        return sum;
    }
    
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the valus of a and b :");
      int a=sc.nextInt();
      int b=sc.nextInt();
      
      int sum=Add(a,b);                    //Function call
      System.out.println(sum);
      
    }
}