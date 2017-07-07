// Date:
// Problem
// Question: Write a function to find the longest common prefix string amongst an array of strings.

// Assumption Made:

// Time Complexity -->
// Space Complexity -->

// Import necessary libraries
import java.io.*;

// Declare Class Name
public class CommonPrefix {
    
    // Constructor
    public CommonPrefix() {
        
    }
    
    
    // Function which is the solution to the problem
    public String longestCommonPrefix(String[] strs) {
        if(strs.length < 1 || strs[0].length() < 1){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;
        int arrayLength = strs.length;
        boolean mismatch = false;
        while(true){
            while(i+1 < arrayLength){
                if(j < strs[i].length() && j < strs[i+1].length()){
                    if(strs[i].charAt(j) != strs[i+1].charAt(j)){
                        mismatch = true;
                        break;
                    }
                }
                else {
                    mismatch = true;
                    break;
                }
                i++;
            }
            i = 0;
            if(!(mismatch) && j < strs[0].length()){
                sb.append(strs[0].charAt(j));
            }
            else {
                return sb.toString();
            }
            j++;
        }
    }
    
    public static void main(String args[]){
        
        CommonPrefix newClass = new CommonPrefix();
        String[] input = new String[2];
        input[0]="help";
        input[1]="hello";
        
        System.out.println(newClass.longestCommonPrefix(input));
    }
}

