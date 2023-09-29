import java.util.*;
public class Transpose_Array{
    public static void Transpose(int matrix[][]){

        System.out.println("Matrix Before Transpose :");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Matrix After Transpose :");
        for(int i=0; i<matrix[0].length; i++){
            for(int j=0; j<matrix.length; j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]){
        int matrix[][]={{1,2},{4,5},{7,8}};
        Transpose(matrix);
    }
}