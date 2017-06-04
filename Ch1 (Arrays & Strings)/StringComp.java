// Date: 03/19/2017
// Problem 1.6
// Question: String Compression: Implement a method to perform basic string compression using the counts of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the "compressed" string would not become smaller than the original string, your method should return
//  the original string. You can assume the string has only uppercase and lowercase letters (a - z).

// Assumption Made: None. (Note : You can assume the string has only uppercase and lowercase letters (a - z) )

// Time Complexity --> O(n)
// Space Complexity --> O(1)

// Import necessary libraries
import java.io.*;

// Declare Class Name
public class StringComp {
    
    // Constructor
    public StringComp() {
        
    }
    
    
    // Function which is the solution to the problem
    public String getCompressedString(String s) {
        StringBuilder rsltString = new StringBuilder();
        int counter = 1;
        String temp = "";
        int i;
        
        for(i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                counter++;
            }
            else {
                temp = s.charAt(i-1) + Integer.toString(counter);
                rsltString.append(temp);
                counter = 1;
            }
        }
        
        temp = s.charAt(i-1) + Integer.toString(counter);
        rsltString.append(temp);
        
        return rsltString.toString();
    }
    
    public static void main(String args[]){
        
        StringComp newClass = new StringComp();
        String input = "aabcccccaaae";
        
        System.out.println("Compressed String: " + newClass.getCompressedString(input));
    }
}
