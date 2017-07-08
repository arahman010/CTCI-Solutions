// Date: 07/08/2017
// Problem
// Question: How would you design a stack which, in addition to push and pop, has a function min which returns the minimum element? 
// Push,pop and min should all operate in O(1) time.

// Assumption Made: 

// Time Complexity --> Same ase before
// Space Complexity --> O(n)  , This is the problem

// Import necessary libraries
import java.io.*;
import java.util.*;

// Declare Class Name
public class Q2_StackMin_1 extends MyStack<NodeWithMin>{
    
    // No Custom Constructor
    // Changing push for this child class
    public void push(int value){
        int newMin = Math.min(value,min());
        super.push(new NodeWithMin(value,newMin));
    }

    // Have to change print function for this one too

    public void printStack(){
        StackNode<NodeWithMin> temp = this.top;
        while(temp != null){
            System.out.print(temp.data.value);
            System.out.print(" , ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    public int min(){
        if(this.isEmpty()){
            return Integer.MAX_VALUE;
        }
        else {
            return peek().min;
        }
    }
    
    // Function which is the solution to the problem

    
    public static void main(String args[]){
        
        Q2_StackMin_1 newClass = new Q2_StackMin_1();

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

class NodeWithMin {
        public int value;
        public int min;

        public NodeWithMin(int data, int minVal){
            this.value = data;
            this.min = minVal;
        }
    }
