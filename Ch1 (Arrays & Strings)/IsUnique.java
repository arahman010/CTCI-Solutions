// Date: 03/14/17
// Problem 1.1
// Is Unique: Implement an algorithm to determine if a string has all unique characters.
// What if you cannot use additional data structures?

// Assumption Made: String is ASCII ( 128 ), Case sensitive.
// Time Complexity --> O(n)
// Space Complexity --> O(1)

import java.io.*;

public class IsUnique {


        // Constructor
    public IsUnique() {
        
    }
    
    public boolean isUnique(String S) {
        int[] charArray = new int[128];
        
        // This is also right
      /*  for(int j = 0; j < S.length(); j++) {
            int val = S.charAt(j);
            charArray[val]++;
            //System.out.println(val);
            if(charArray[val] > 1) {
                return false;
            }           */
        int ascii = 0;
        for(char c: S.toCharArray()) {
            ascii = (int) c;
            if(charArray[ascii] != 0){
                return false;
            }
            else {
                charArray[ascii]++;
            }
        
        }
        
        return true;
    }
    
    public static void main(String args[]){
        
        IsUnique newClass = new IsUnique();
        
        
        String input = "Uniqe";
        if ( newClass.isUnique(input) ) {
            System.out.println("Input is unique");
        } else {
            System.out.println("Input is not unique");
        }
    
    }

}
