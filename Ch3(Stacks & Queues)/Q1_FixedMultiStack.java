// Date: 07/08/2017
// Problem
// Question: Describe how you could use a single array to implement three stacks.

// Assumption Made: All the stacks are of same capacity.

// Time Complexity --> N/A
// Space Complexity --> N/A

// Import necessary libraries
import java.io.*;
import java.util.*;

// Declare Class Name
public class Q1_FixedMultiStack {
    //stack num will be like : 0, 1, 2
    int numOfStacks = 3;
    int stackCapacity;
    int[] values;
    int[] sizes;

    // Constructor
    public Q1_FixedMultiStack(int stackSize) {
        stackCapacity = stackSize;
        values = new int[stackCapacity * numOfStacks];
        sizes = new int[numOfStacks];
        
    }

    //isFull
    public boolean isFull(int stackNum){
        if (sizes[stackNum] >= stackCapacity){
            return true;
        }
        return false;
    }

    //isEmpty
    public boolean isEmpty(int stackNum){
        return sizes[stackNum] == 0;
    }

    //topIndexOf
    public int topIndexOf(int stackNum){
        if(isFull(stackNum)){
            throw new FullStackException();
        }
        int offset = stackNum * stackCapacity;
        return offset + sizes[stackNum] - 1;
    }
    
    //push
    public void push(int stackNum, int item){
        if(isFull(stackNum)){
            throw new FullStackException();
        }
        sizes[stackNum]++;
        values[topIndexOf(stackNum)] = item;
    }
    
    //pop
    public int pop(int stackNum){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int retVal = values[topIndexOf(stackNum)];
        values[topIndexOf(stackNum)] = 0; // Clear Value
        sizes[stackNum]--;
        return retVal;
    }

    //peek 
    public int peek(int stackNum){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return values[topIndexOf(stackNum)];
        
    }

    public void printStack(int stackNum){
        int startIndex = stackNum * sizes[stackNum];
        int endIndex = topIndexOf(stackNum);
        System.out.print("Printing " + stackNum + "th stack: ");
        while(startIndex <= endIndex){
            System.out.print(values[startIndex]);
            System.out .print(" , ");
            startIndex++;
        }
        System.out.println();
    }
    
    public static void main(String args[]){
        
        Q1_FixedMultiStack newClass = new Q1_FixedMultiStack();
        
        System.out.println("Print Something");
    }
}
