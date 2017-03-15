// Date: 03/14/2017
// Problem 1.2
// Question: Check Permutation: Given two strings,write a method to decide if one is a permutation of the
// other.

// Assumption Made: Case Sensitive; WhiteSpace significant; String is ASCII.

// Time Complexity --> O(max(m,n,128))
// Space Complexity -->O(1)

// Import necessary libraries
import java.io.*;

// Declare Class Name
public class CheckPermutation {
    
    // Constructor
    public CheckPermutation() {
        
    }

    
    public static void main(String args[]){
        
        CheckPermutation newClass = new CheckPermutation();
        
        String input1 = "Hello1";
        String input2 = "elHlo2";
        
        if(newClass.isPermutation(input1,input2)){
            System.out.println(input1 + " & " + input2 + " is permutation of one another!");
        } else {
            System.out.println(input1 + " & " + input2 + " is not permutation of one another!");
        }
        
    }
    
    // Function which is the solution to the problem
    public boolean isPermutation(String s, String t) {
        if(s.length() != t.length() ) {
            return false;
        }
        int[] howManyLetters = new int[128];
        for(int i = 0; i < s.length(); i++){
            howManyLetters[s.charAt(i)]++;
        }
        for(int j = 0; j < t.length(); j++) {
            howManyLetters[t.charAt(j)]--;
        }
        
        for(int k = 0; k < howManyLetters.length; k++){
            if (howManyLetters[k] != 0){
                return false;
            }
        }
        return true;
        
    }
}
