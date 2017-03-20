// Date: 03/15/2017
// Problem 1.5
// Question: One Away: There are three types of edits that can be performed on strings: insert a character, remove a character, or replace a character. Given two strings, write a function to check if they are one edit (or zero edits) away.
// EXAMPLE
//  pale, ple -> true pales,
//  pale -> true pale,
//  bale -> true pale,
//  bake -> false

// Assumption Made: ASCII, Case Sensetive, WhiteSpace considered.

// Time Complexity --> O(n)
// Space Complexity --> O(1)

// Import necessary libraries
import java.io.*;

// Declare Class Name
public class OneAway {
    
    // Constructor
    public OneAway() {
        
    }
    
    
    // Function which is the solution to the problem
    // Wrong Solution
    // kept here to remind me what I did wrong
    
 /*   public boolean isOneAway(String s, String t) {
        int[] sChar_set = new int[128];
        int[] tChar_set = new int[128];
        if(s.length() - t.length() > 1 || s.length() - t.length() < -1) {
            return false;
        }
        
        for(int i = 0; i < s.length(); i++)
            sChar_set[s.charAt(i)]++;
        
        for(int j = 0; j < t.length(); j++)
            tChar_set[t.charAt(j)]++;
        
        int dissimilarities = 0;
        
        for(int k = 0; k < 128 ; k++) {
            if (sChar_set[k] != tChar_set[k])
                dissimilarities++;
        }
        
        if(dissimilarities > 2) {
            return false;
        }
        else if (dissimilarities == 2){
            if(s.length() == t.length()){
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return true;
        }
        
    }           */
    
    public boolean isOneAway(String s, String t) {
        int lengthDiff = s.length() - t.length();
        if (lengthDiff == 0)
            return oneReplaceAway(s,t);
        else if (lengthDiff == 1)
            return oneEditAway(s,t);
        else if (lengthDiff == -1)
            return oneEditAway(t,s);
        else
            return false;
    
    }
    
    public boolean oneReplaceAway(String s, String t) {
        boolean oneFound = false;
        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(i)){
                if(!oneFound){
                    oneFound = true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean oneEditAway(String s, String t) {
        boolean oneDisFound = false;
        int j = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != t.charAt(j)){
                if(!oneDisFound){
                    oneDisFound = true;
                    i++;
                } else {
                    return false;
                }
            } else {
                j++;
            }
        }
        return true;
    }
    
    public static void main(String args[]){
        
        OneAway newClass = new OneAway();
        
        String inputString1 = "aabc";
        String inputString2 = "aac";
        
        if(newClass.isOneAway(inputString1,inputString2)){
            System.out.println(inputString1 + " & " + inputString2 + " are one/zero away!");
        }
        else {
            System.out.println(inputString1 + " & " + inputString2 + " are not one away!");
        }
        
        //System.out.println("Print Something");
    }
}
