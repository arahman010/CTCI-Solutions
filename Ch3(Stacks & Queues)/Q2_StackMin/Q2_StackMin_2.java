// Date: 07/08/2017
// Problem
// Question: How would you design a stack which, in addition to push and pop, has a function min which returns the minimum element? 
// Push,pop and min should all operate in O(1) time.

// Assumption Made: Will do will less space taken

// Time Complexity --> O(1)
// Space Complexity --> O(1)

// Import necessary libraries
import java.io.*;
import java.util.*;

// Declare Class Name
public class Q2_StackMin_2 extends MyStack<Integer> {

    // Keep a stack to keep track of the minimums
    MyStack<Integer> minStack;
    
    // Constructor
    public Q2_StackMin_2() {
        minStack = new MyStack<Integer>();
        
    }

    // Implement min function first
    public Integer min(){
        if(minStack.isEmpty()){
            return Integer.MAX_VALUE;       // Error code
        }
        return minStack.peek();
    }

    // Modify Push
    public void push(int value){
        if(value <= min()){             // '=' is for duplicate values
            minStack.push(value);
        }
        super.push(value);
    }

    //Modify Pop
    public Integer pop(){
        Integer poppedVal = super.pop();
        if(poppedVal == min()){
            minStack.pop();
        }
        return poppedVal;
    }
    
    
    public static void main(String args[]){
        
        Q2_StackMin_2 newClass = new Q2_StackMin_2();

        newClass.push(10);
        newClass.push(12);
        newClass.push(33);
        newClass.push(3);
        
        newClass.printStack();
        System.out.println("Min is : " + newClass.min());

        newClass.pop();

        newClass.printStack();
        System.out.println("Min is : " + newClass.min());
        
        // System.out.println("Print Something");
    }
}
