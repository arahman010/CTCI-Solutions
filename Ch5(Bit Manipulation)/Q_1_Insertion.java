// Date: 19/06/2017
// Problem
// Question: See book

// Assumption Made:

// Time Complexity -->
// Space Complexity -->

// Import necessary libraries
import java.io.*;
import java.util.*;

// Declare Class Name
public class Q_1_Insertion {
    
    // Constructor
    public Q_1_Insertion() {
        
    }
    
    
    // Function which is the solution to the problem
    public int insertion(int N, int M, int i, int j) {
        int mask = (1 << (j+1))-1;
        mask = ~mask | ((1 << i)-1);
        //System.out.println(Integer.toBinaryString(mask));
        N = N & mask;
        M = M << i;
        int result = N | M;
        return result;
    
    }
    
    public static void main(String args[]){
        
        Q_1_Insertion newClass = new Q_1_Insertion();
        
        int N = Integer.parseInt("10000000000", 2);
        int M = Integer.parseInt("10011", 2);
        int result = newClass.insertion(N,M,2,6);
        
        System.out.println(Integer.toBinaryString(result));
    }
}
