import java.util.*;
class SwapUsingThird{
    public static void main(String args[]){
        int a = 3;
        int b = 6;
        int temp;
        System.out.println("Before Swapping Numbers are :" + a+","+ b);

        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping Numbers are :" + a + ","+ b);
    }
}