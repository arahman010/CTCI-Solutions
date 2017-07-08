// Date: 07/08/2016
// My Queue Class implemented from book and will be used by other solutions.


// Import necessary libraries
import java.io.*;
import java.util.*;

// Declare Class Name
public class MyQueue<T> {
    private static class QueueNode<T> {
        private T data;
        private QueueNode<T> next;

        public QueueNode(T data){
            this.data = data;
        }
    }
    
    // No Custom MyQueue Constructor

    private QueueNode<T> first;
    private QueueNode<T> last;

    //add
    public void add(T item){
        QueueNode<T> temp = new QueueNode<T>(item);
        if (last != null){
            last.next = temp;
        }
        last = temp;
        if(first == null){
            first = last;
        }
    }

    //remove
    public T remove(){
        if(first == null){
            throw new NoSuchElementException();
        }
        T firstData = first.data;
        if(last == first){
            last = null;
        }
        first = first.next;
        return firstData;
    }

    //peek
    public T peek(){
        if(first != null){
            return first.data;
        }
        throw new NoSuchElementException();
    }
    
    //isEmpty
    public boolean isEmpty(){
        return first == null;
    }
    
    public void printQueue() {
        QueueNode<T> temp = first;
        while(temp != null){
            System.out.print(temp.data);
            System.out.print(" , ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    public static void main(String args[]){
        
        MyQueue<Integer> newClass = new MyQueue<Integer>();
        
        newClass.add(1);
        newClass.add(2);
        newClass.add(3);
        newClass.add(4);

        newClass.printQueue();

    }
}
