// Date:
// Problem
// Question: String Rotation:Assumeyou have a method isSubstringwhich checks if one word is a substring of another. Given two strings, sl and s2, write code to check if s2 is a rotation of sl using only one call to isSubstring (e.g.,"waterbottle" is a rotation of"erbottlewat").

// Assumption Made: IsSubString is of O(n) runtime

// Time Complexity --> O(n)
// Space Complexity --> O(n)

// Import necessary libraries
import java.io.*;

// Declare Class Name
public class StrRotation {
    
    // Constructor
    public StrRotation() {
        
    }
    
    //IsSubStr given (str.indexOf(substr) != -1)
    // Function which is the solution to the problem
    public boolean isRotation(String s1, String s2) {
        if(s1.length() != 0 && s1.length() == s2.length()) {
            String temp = s1 + s1;
            int result = temp.indexOf(s2);
            if(result != -1){
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
        
    
    }
    
    public static void main(String args[]){
        
        StrRotation newClass = new StrRotation();
        
        String input1 = "watterbottler";
        String input2 = "erbottlewattr";
        
        if(newClass.isRotation(input1,input2)){
            System.out.println(input2 + " is Rotation of : " + input1);
        }
        else {
            System.out.println(input2 + " is not Rotation of : " + input1);
        }
        
        
    }
}
