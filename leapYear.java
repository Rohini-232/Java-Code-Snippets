import java.util.*;
public class leapYear{
    public static void main(String args[]){
        int year;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        year=sc.nextInt();

        if(year%4==0)
        {
            if(year%100!=0 || year%400==0){
                System.out.println("This is leap year");
            }
        }
        else{
            System.out.println("This is not leap year");
        }
    }
}