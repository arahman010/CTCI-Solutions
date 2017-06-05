// Date: 06/05/2017


// Import necessary libraries
import java.io.*;

// Declare Class Name
public class Node {
    
    Node next = null;
    int data;
    
    // Constructor
    public Node(int d) {
        data = d;
    }
    
    
    // Function which is the solution to the problem
    public void appendToTail(int d) {
        Node end = new Node(d);
        Node n = this;
        while(n.next != null) {
            n = n.next;
        }
        n.next = end;
    }
    
    public void printList() {
        Node n = this;
        while(n.next != null) {
            System.out.print(n.data);
            System.out.print(" , ");
            n = n.next;
        }
    }
    
/*    public static void main(String args[]){
        
        FileName newClass = new FileName();
        
        System.out.println("Print Something");
    }  */
}
