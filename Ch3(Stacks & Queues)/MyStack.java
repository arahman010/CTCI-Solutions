// Date: 07/06/2017
// This is the Stack Class to be used by the solutions of this chapters

// Import necessary libraries
import java.io.*;
import java.util.*;

// Declare Class Name
public class MyStack<T> {

    protected static class StackNode<T> {       // Protected: to make accessible to child classes
        protected T data;
        protected StackNode<T> next;

        public StackNode(T data){
            this.data = data;
        }
    }

    // private StackNode<T> top;
    protected StackNode<T> top;         // Protected: For making it accessible to child classes

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
            temp = temp.next;
        }
        System.out.println();
    }

  // There is no custom constructor for MyStack Class
    
    public static void main(String args[]){
        
        MyStack<Integer> newClass = new MyStack<Integer>();
        newClass.push(1);
        newClass.push(2);
        newClass.push(3);
        newClass.push(4);
        
        newClass.printStack();
        // System.out.println("Print Something");
    }
}
