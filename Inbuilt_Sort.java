import java.util.Collections;
import java.util.Arrays;
public class Inbuilt_Sort{
    public static void print(Integer arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    } 
    public static void main(String args[]){
        Integer arr[]={5,4,1,3,2};
        Arrays.sort(arr,0,3);                           //inbuilt function for sorting in Ascending order
       // Arrays.sort(arr,0,2);          //sorting from index 0 to index 2...but ending index should be +1 index

       
        print(arr);
    }
}