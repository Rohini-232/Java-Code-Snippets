import java.util.*;
public class SUM{
    public static int sum(int matrix[][]){
        int sum=0;
        for(int i=1; i<matrix.length; ){
            for(int j=0; j<matrix[0].length; j++){
                sum+=matrix[i][j];
            }
        }
        return sum;
    } 
    public static void main(String args[]){
        int matrix[][]={{1,4,9},{11,4,3},{2,2,3}};
        System.out.print(sum(matrix));
    }
}