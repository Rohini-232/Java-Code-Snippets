import java.util.*;
public class Largest_in_Array{
    public static int Largest(int numbers[]){
        int largest= Integer.MIN_VALUE;
        for(int i=0; i< numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int numbers[]={1,6,8,3,0,4};
        System.out.println("Largest number is " +Largest(numbers));
    }
}