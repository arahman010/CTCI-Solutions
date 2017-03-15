// Date: 03/14/2017
// Problem 1.3
// Question: URLi : Write a method to replace all spaces in a string with '%20  You may assume that the string has suf cient space at the end to hold the additional characters,and that you are given the "true" length of the string. (Note: If implementing in Java,please use a character array so that you can perform this operation in place.)

//EXAMPLE
//  Input: "Mr John Smith    ", 13
//  Output: "Mr%20John%20Smith"

// Assumption Made:

// Time Complexity -->
// Space Complexity -->

// Import necessary libraries
import java.io.*;

// Declare Class Name
public class URLify {
    
    // Constructor
    public URLify() {
        
    }
    
    
    // Function which is the solution to the problem
    public String toURL(String s, int trueLength) {
        int lastSpaces = s.length() - trueLength;
        char[] s_array = s.toCharArray();
        for(int i = trueLength - 1; i >= 0; i--) {
            if(s_array[i] != ' '){                      // Not WhiteSpace
                s_array[i+lastSpaces] = s_array[i];
            } else {
                s_array[i+lastSpaces] = '0';
                s_array[i+lastSpaces-1] = '2';
                s_array[i+lastSpaces-2] = '%';
                lastSpaces -= 2;
            }
        }
        return new String(s_array);
        
    }
    
    public static void main(String args[]){
        
        URLify newClass = new URLify();
        
        System.out.println(newClass.toURL("Mr John Smith       ",14));
    }
}
