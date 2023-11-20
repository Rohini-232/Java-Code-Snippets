import java.util.*;
public class bit_Manipulation{

    public static void evenOrOdd(int n){
        int bitmask =1;
        if((n & bitmask) == 0){
            System.out.println("Even");
        }else{
            System.out.println("odd");
        }
    }

    public static void get_ith_Bit(int n, int i){
        int bitmask =1<<i;
        if((n & bitmask) == 0){
            System.out.println("0");
        }else{
            System.out.println("1");
        }
    }

    public static int set_ith_Bit(int n, int i){
        int bitmask =1<<i;
        return (n | bitmask);    
    }

    public static int clear_ith_Bit(int n, int i){
        int bitmask =~(1<<i);
        return (n & bitmask);    
    }

    public static int update_ith_Bit(int n, int i, int newbit){
    //    if(newbit ==0){
    //     return clear_ith_Bit(n,i);
    //    }else{
    //     return set_ith_Bit(n,i);
    //    } 

    n=clear_ith_Bit(n,i);
    int bitmask = newbit<<i;
    return n | bitmask;
    }

    public static int clear_bits(int n, int i){
        int bitmask = (~0 << i);
        return n & bitmask ;
    }

    public static int clearBitsInRange(int n, int i, int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitmask = a|b;
        return n & bitmask;
    }

    public static boolean powerOfTwo(int n){
        return (n & (n-1)) == 0;       
    }

    public static int countSetBits(int n){
        int count = 0;
        while(n > 0){
            if((n & 1) !=0){               // check LSB
                count++;
            }
            n=n>>1;
        }
        return count;
    }

    public static void main(String args[]){
        //System.out.println(~1);
        //evenOrOdd(54);
        //get_ith_Bit(10,3);
        // System.out.println(set_ith_Bit(10,2));
        //System.out.println(clear_ith_Bit(10,1));
        //System.out.println(update_ith_Bit(10,1,0));
        //System.out.println(clear_bits(7,1));
        //System.out.println(clearBitsInRange(10,2,4));
        //System.out.println(powerOfTwo(10));
        System.out.println(countSetBits(7));
        
    }
}