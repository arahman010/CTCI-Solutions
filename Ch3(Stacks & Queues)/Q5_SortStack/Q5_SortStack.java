// Date: 07/09/2017
// Problem
// Question: Sort a stack using only one additional stack.

// Assumption Made: Integer values.

// Time Complexity --> O(N^2)
// Space Complexity -->

// Import necessary libraries
import java.io.*;
import java.util.*;

// Declare Class Name
public class Q5_SortStack {
    

    // Constructor
    public Q5_SortStack() {
        
    }
    
    
    // Function which is the solution to the problem
    public void sortStack(MyStack<Integer> stack) {
        MyStack<Integer> tempStack = new MyStack<Integer>();

        while(!stack.isEmpty()){
            int temp = stack.pop();
            while(!tempStack.isEmpty() && tempStack.peek() > temp){
                stack.push(tempStack.pop());
            }
            tempStack.push(temp);
        }

        while(!tempStack.isEmpty()){
            stack.push(tempStack.pop());
        }
        // return stack;

    
    }
    
    public static void main(String args[]){
        
        Q5_SortStack newClass = new Q5_SortStack();
        
        MyStack<Integer> inputStack = new MyStack<Integer>();

        inputStack.push(45);
        inputStack.push(32);
        inputStack.push(55);
        inputStack.push(121);
        inputStack.push(23);
        
        System.out.print("Before Sorting: ");

        inputStack.printStack();

        newClass.sortStack(inputStack);

        System.out.print("After Sorting: ");

        inputStack.printStack();


    }
}
