import java.util.*;
class Palindrome{
    public static void main(String args[]){
        String name ="";
        String Temp ="";

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        name=sc.nextLine();

        for(int i=0; i<name.length(); i++){
           char ch=name.charAt(i);
           Temp=ch+Temp;
        }
        if(name.equals(Temp)){
            System.out.println("This is palindrome ");
        }
        else{
            System.out.println("This is not palindrome ");
        }

    }
}