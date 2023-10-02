import java.util.*;
public class Diagonal_Sum{
    public static int DiagonalSum(int matrix[][]){
        int sum=0;
        // for(int i=0; i<matrix.length-1; i++){
        //     for(int j=0; j<matrix[0].length-1; j++){
                   
        //         //Primary Diagonal
        //         if(i == j){
        //             sum+=matrix[i][j];
        //         }
        //         //Secondary Diagonal
        //         else if(i+j == matrix.length-1){
        //             sum+=matrix[i][j];
        //         }

        //     }
        // }
        // return sum;

        for(int i=0; i<matrix.length; i++){
            //pd
            sum+=matrix[i][i];
            //sd
            if(i != matrix.length-i-1)
            sum+=matrix[i][matrix.length-i-1];
        }
        return sum;
    }

    public static void main(String args[]){
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.print(DiagonalSum(matrix));
    }
}