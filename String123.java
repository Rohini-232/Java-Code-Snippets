import java.util.*;
public class String123{
    public static void main(String args[]){
        String str1="Rohini";
        String str2="Ghotale";

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string :");
        String name=sc.nextLine();
        System.out.println("you Entered string : "+name);

        int length= str1.length();
        System.out.println(length);
       
        System.out.println(str1.toUpperCase());
        System.out.println(str2.toLowerCase());

        System.out.println(str1.concat (str2));
        System.out.println(str1.replace('i','a'));

        System.out.println(str1.substring(2));
        System.out.println(str1.substring(2,5));

        System.out.println(str1.equals (str2));
        System.out.println(str1.charAt(2));

        System.out.println(str1.compareToIgnoreCase(str2));
        System.out.println(str1.compareTo(str2));
    }
}