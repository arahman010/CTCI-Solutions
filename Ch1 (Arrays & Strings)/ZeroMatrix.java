// Date: 06/04/2017
// Problem
// Question: Zero Matrix: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.

// Assumption Made: N/A

// Time Complexity --> O(n)
// Space Complexity --> O(n)

// Import necessary libraries
import java.io.*;

// Declare Class Name
public class ZeroMatrix {
    
    // Constructor
    public ZeroMatrix() {
        
    }
    
    
    // Function which is the solution to the problem
    public int[][] makeZero(int[][] mat) {
        int[] rows = new int[mat.length];
        int[] cols = new int[mat[0].length];
        
        for(int i = 0 ; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if(mat[i][j] == 0){
                    rows[i] = 1;
                    cols[j] = 1;
                }
            }
        }
        
        for(int k = 0; k < rows.length; k++){
            if(rows[k] == 1){
                mat = makeRowZero(k,mat);
            }
        }
        
        for(int m = 0; m < cols.length; m++){
            if(cols[m] == 1){
                mat = makeColZero(m,mat);
            }
        }
        
        return mat;
    
    }
    
    
    //Make Column zero
    public int[][] makeRowZero(int row, int[][] matrix){
        for(int i = 0; i < matrix[0].length; i++){
            matrix[row][i]=0;
        }
        return matrix;
        
    }
    
    //Make Row Zero
    public int[][] makeColZero(int col, int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            matrix[i][col]=0;
        }
        return matrix;
    }
    
    //Print Matrix
    
    public void printMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j]);
                System.out.print(" | ");
            }
            System.out.print("\n");
        }
    }
    
    public static void main(String args[]){
        
        ZeroMatrix newClass = new ZeroMatrix();
        
        int k = 1;
        int[][] matrix = new int[7][6];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = k;
                k++;
            }
        }
        
        matrix[3][5] = 0;
        matrix[4][2] = 0;
        
        newClass.printMatrix(matrix);
        
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("\n");
        
        matrix = newClass.makeZero(matrix);
        newClass.printMatrix(matrix);
        

        
        //System.out.println("Print Something");
    }
}
