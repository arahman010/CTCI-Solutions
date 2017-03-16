// Date: 03/15/2017
// Problem 1.4
// Question: Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palin­ drome. A palindrome is a word or phrase that is the same  rwards and backwards. A permutation is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.

// EXAMPLE
//  Input: Tact Coa
//  Output: True (permutations: "taco cat", "atco eta", etc.)

// Assumption Made: ASCII, Case Insensitive, White Spaces disregarded while testing if palindrome.

// Time Complexity --> O (max(n,128))
// Space Complexity --> O(1) casue the array is of fixed size 128.

// Import necessary libraries
import java.io.*;

// Declare Class Name
public class PalindromePermutation {
    
    // Constructor
    public PalindromePermutation() {
        
    }
    
    
    // Function which is the solution to the problem
    public boolean isPalPer(String input) {
        String s = input.toLowerCase();
        int totalSpaces = 0;
        int[] s_array = new int[128];                       // Should have named something else
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' '){
                s_array[s.charAt(i)]++;
            } else {
                totalSpaces++;
            }
        }
        
        boolean middleOneFound = false;
        int totalNonSpaces = s.length() - totalSpaces;
        
        for(int j = 0; j < s_array.length; j++) {
            if( totalNonSpaces % 2 == 0) {                    // Even non-spaces
                if(s_array[j] % 2 != 0) {
                    return false;
                }
            }
            else {                                             // Odd non-spaces
                if(s_array[j] %2 != 0) {
                    if(!middleOneFound){
                        middleOneFound = true;
                    }
                    else {
                        return false;
                    }
                }
            }
        }
        
        // If the program comes here that means it is permutation of some palindrome
        return true;
        
    }
    
    public static void main(String args[]){
        
        PalindromePermutation newClass = new PalindromePermutation();
        
        String inputString = "ababbacddc";
        
        if(newClass.isPalPer(inputString)){
            System.out.println(inputString + " is permutation of some palindrome!");
        }
        else {
            System.out.println(inputString + " is not permutation of some palindrome!");
        }
    
    }
}
