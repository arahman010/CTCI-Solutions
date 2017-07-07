// Date: 07/06/2017
// This is the Stack Class to be used by the solutions of this chapters

// Import necessary libraries
import java.io.*;
import java.util.*;

// Declare Class Name
public class MyStack<T> {

    private static class StackNode<T> {
        private T data;
        private StackNode next;

        public StackNode<T>(T data){
            this.data = data;
        }
    }

    private StackNode top;

    // Push 
    public void push(T item){
        StackNode<T> t = new StackNode<T>(item);
        t.next = top;
        top = t;
    }

    //Pop
    public T pop(){
        if(top == null)
            throw new EmptyStackException();

        T topData = top.data;
        top = top.next;
        return topData;
    }

    //Peek
    public T peek(){
        if(top == null)
            throw new EmptyStackException();
        return top.data;
    }

    //isEmpty
    public boolean isEmpty(){
        return top == null;
    }

    //Print Stack
    public void printStack(){
        StackNode temp = top;
        while(temp != null){
            System.out.print(temp.data);
            System.out.print(" , ");
        }
    }

  
    
    public static void main(String args[]){
        
        MyStack newClass = new MyStack<int>();
        newClass.push(1);
        newClass.push(2);
        newClass.push(3);
        newClass.push(4);
        
        newClass.printStack();
        // System.out.println("Print Something");
    }
}
