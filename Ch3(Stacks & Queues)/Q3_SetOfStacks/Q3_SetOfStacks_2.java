// Date: 07/08/2017
// Problem
// Question: Implement set of stacks mimicking stack of plates.
// Addition: Impelement a function 'popAt(int Index)' which performs a pop operation on a specific sub-stack.

// Assumption Made: For addition, here we assume not all the stacks have to be of same capacity. PopAt is implemented here.
// In this case, all the stacks will not be of the same size.

// Time Complexity -->
// Space Complexity -->

// Import necessary libraries
import java.io.*;
import java.util.*;

// Declare Class Name
public class Q3_SetOfStacks_2 {
    ArrayList<MyStack<Integer>> stacks;
    int capacity;

    
    // Constructor
    public Q3_SetOfStacks_2(int stackCapacity) {
        this.stacks = new ArrayList<MyStack<Integer>>();
        this.capacity = stackCapacity;
    }
    
    // Implement getLastStack
    public MyStack<Integer> getLastStack(){
        if(stacks.size() == 0){
            return null;
        }
        return stacks.get(stacks.size() - 1);
    }

    //push
    public void push(int value){
        MyStack<Integer> lastStack = this.getLastStack();
        if(lastStack != null && !lastStack.isFull()){
            lastStack.push(value);
        }
        else {
            MyStack<Integer> newStack = new MyStack<Integer>(this.capacity);
            newStack.push(value);
            stacks.add(newStack);
        }
    }

    //pop
    public Integer pop(){
        MyStack<Integer> lastStack = this.getLastStack();
        if(lastStack != null && !lastStack.isEmpty()){
            int poppedVal = lastStack.pop();
            if(lastStack.isEmpty()){
                stacks.remove(stacks.size() - 1);
            }
            return poppedVal;
        }
        else {
            throw new EmptyStackException();
        }
    }

    //peek
    public Integer peek(){
        MyStack<Integer> lastStack = this.getLastStack();
        if(lastStack != null && !lastStack.isEmpty()){
            int poppedVal = lastStack.peek();
            return poppedVal;
        }
        else {
            throw new EmptyStackException();
        }
    }

    //isEmpty
    public boolean isEmpty(){
        return stacks.size() == 0;
    }
    

    //popAt
    public Integer popAt(int index){
        if(index >= 0 && index < stacks.size()){
            MyStack<Integer> stack = stacks.get(index);
            return stack.pop();
        }
        return null;
    }

    //print
    public void printStack() {
        for(int i = 0; i < stacks.size(); i++){
            MyStack<Integer> stack = stacks.get(i);
            System.out.print((i+1) + " th stack: ");
            stack.printStack();
        }

    }
    public static void main(String args[]){
        
        Q3_SetOfStacks_2 newClass = new Q3_SetOfStacks_2(3);
        
        newClass.push(1);
        newClass.push(2);
        newClass.push(3);
        newClass.push(4);
        newClass.push(5);
        newClass.push(6);
        newClass.push(7);

        newClass.popAt(1);        
        newClass.printStack();
    }
}
