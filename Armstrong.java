import java.util.*;

public class Armstrong{
    public static void main (String args[]){
        
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int num = a;
        int count=0;
        int rem =0;
        int armstrong =0;

        while(num !=0){
            num= num/10;
            count++;
        }
        while(num>=0){
            rem = num %10;
           //System.out.println(rem);
            armstrong += Math.pow(rem , count);
            num = num /10;
        }
        
        System.out.println(count);
        //System.out.print(armstrong);
        
        // if(armstrong == a){
        //     System.out.print("yes");
        // }else{
        //     System.out.print("no");
        // }
        
    }
}