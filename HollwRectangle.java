import java.util.*;

public class HollwRectangle{

    public static void Pattern(int totRows, int totCols){
        for(int i=1; i<=totRows; i++){                            //Outer loop

            for(int j=1; j<=totCols; j++){                        //Inner Colums
                if(i==1 || i==totRows || j==1 || j==totCols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String args[]){
        Pattern(4,5);
    }
}