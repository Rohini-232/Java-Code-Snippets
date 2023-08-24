import java.util.*;

public class AverageOfThree{
    public static double Average(double a, double b, double c){
        
        return (a+b+c)/3;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of a,b,c");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();

        //int Avg=Average(a,b,c);
        System.out.println(Average(a,b,c));
    }
}