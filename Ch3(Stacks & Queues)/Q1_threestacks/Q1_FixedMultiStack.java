// Date: 07/08/2017
// Problem
// Question: Describe how you could use a single array to implement three stacks.

// Assumption Made: All the stacks are of same capacity.

// Time Complexity --> N/A
// Space Complexity --> N/A

// Import necessary libraries
// package threestacks;
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
        int offset = stackNum * stackCapacity;
        return offset + sizes[stackNum] - 1;
    }
    
    //push
    public void push(int stackNum, int item){
        if(isFull(stackNum)){
            System.out.println("Err: The Stack is full!");
            return;
        }
        sizes[stackNum]++;
        values[topIndexOf(stackNum)] = item;
    }
    
    //pop
    public int pop(int stackNum){
        if(isEmpty(stackNum)){
            throw new EmptyStackException();
        }
        int retVal = values[topIndexOf(stackNum)];
        values[topIndexOf(stackNum)] = 0; // Clear Value
        sizes[stackNum]--;
        return retVal;
    }

    //peek 
    public int peek(int stackNum){
        if(isEmpty(stackNum)){
            throw new EmptyStackException();
        }
        return values[topIndexOf(stackNum)];
        
    }

    public void printStack(int stackNum){
        int startIndex = stackNum * stackCapacity;
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
        
        Q1_FixedMultiStack newClass = new Q1_FixedMultiStack(5);

        // First Stack
        newClass.push(0,1);
        newClass.push(0,2);
        newClass.push(0,3);

        // Second Stack
        newClass.push(1,11);
        newClass.push(1,22);
        newClass.push(1,33);

        //Third Stack
        newClass.push(2,111);
        newClass.push(2,222);
        newClass.push(2,333);

        //Print Stacks
        newClass.printStack(0);
        newClass.printStack(1);
        newClass.printStack(2);

        // Pop values
        newClass.pop(0);
        newClass.pop(1);
        newClass.pop(2);

        //Print after popping
        System.out .println("Printing after popping: ");

        newClass.printStack(0);
        newClass.printStack(1);
        newClass.printStack(2);

        // Trying to overload stacks

        System.out .println("Trying to overload stacks: ");
        newClass.push(0,4);
        newClass.push(0,5);
        newClass.push(0,6);
        newClass.push(0,7);

        newClass.printStack(0);


    }
}
