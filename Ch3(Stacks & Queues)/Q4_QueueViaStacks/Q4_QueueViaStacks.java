// Date: 07/09/2016
// Question: Implement a Queue class which implements Queue class using two stacks.


// Import necessary libraries
import java.io.*;
import java.util.*;

// Declare Class Name
public class Q4_QueueViaStacks<T> {
    
    
    private MyStack<T> stackNewest;
    private MyStack<T> stackOldest;

    public Q4_QueueViaStacks(){
        stackOldest = new MyStack<T>();
        stackNewest = new MyStack<T>();
    }

    //shiftStacks
    private void shiftStacks(){
        if(stackOldest.isEmpty()){
            while(!stackNewest.isEmpty()){
                stackOldest.push(stackNewest.pop());
            }
        }
    }


    //add
    public void add(T item){
        stackNewest.push(item);
    }

    //remove
    public T remove(){
        shiftStacks();
        return stackOldest.pop();
    }

    //peek
    public T peek(){
        shiftStacks();
        if(stackOldest.isEmpty()){
            throw new NoSuchElementException();
        }
        else {
            return stackOldest.peek();
        }
        
    }
    
    //isEmpty
    public boolean isEmpty(){
        return stackNewest.isEmpty() && stackOldest.isEmpty();
    }
    
    public void printQueue() {
        shiftStacks();
        stackOldest.printStack();
    }
    
    public static void main(String args[]){
        
        Q4_QueueViaStacks<Integer> newClass = new Q4_QueueViaStacks<Integer>();
        
        newClass.add(1);
        newClass.add(2);
        newClass.add(3);
        newClass.add(4);
        newClass.add(5);
        newClass.add(6);
        newClass.add(7);
        newClass.add(8);

        System.out.print("Initial Queue: ");


        newClass.printQueue();

        newClass.remove();
        newClass.remove();
        newClass.remove();

        System.out.print("After removing 3 elements Queue: ");

        newClass.printQueue();


    }
}
