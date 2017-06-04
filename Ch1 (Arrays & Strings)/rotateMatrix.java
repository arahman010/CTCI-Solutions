// Date:
// Problem
// Question:

// Assumption Made:

// Time Complexity -->
// Space Complexity -->

// Import necessary libraries
import java.io.*;

// Declare Class Name
public class rotateMatrix{
    
    // Constructor
    public rotateMatrix() {
        
    }
    
    
    // Function which is the solution to the problem
    public boolean rotate(int[][] matrix) {
        int n = matrix.length;
        if(n == 0 || n != matrix[0].length){
            return false;
        }
        for(int layer = 0; layer < n/2; layer++){
            int first = layer;
            int last = n - 1 - layer;
            
            for(int i = first; i < last; i++){
                int offset = i - first;
                int temp = matrix[first][i];
                //Left -> Top
                matrix[first][i] = matrix[last - offset][first];
                //Bottom -> Left
                matrix[last - offset][first] = matrix[last][last-offset];
                //Right -> Bottom
                matrix[last][last-offset] = matrix[i][last];
                //Top -> Right
                matrix[i][last] = temp;
            }
            
        }
        
        printMatrix(matrix);
        return true;
    }
    
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
        
        rotateMatrix newClass = new rotateMatrix();
        
        int k = 1;
        int[][] matrix = new int[6][6];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = k;
                k++;
            }
        }
        
        newClass.printMatrix(matrix);
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("\n");
        newClass.rotate(matrix);
        
        //System.out.println("Print Something");
    }
}
