// Date: 06/25/2017
// Problem
// Question: Delete Middle Node

// Assumption Made:

// Time Complexity -->
// Space Complexity -->

// Import necessary libraries
import java.io.*;
import java.util.*;

// Declare Class Name
public class Q3_DeleteMiddle {
    
    // Constructor
    public Q3_DeleteMiddle() {
        
    }
    
    
    // Function which is the solution to the problem
    public boolean deleteMiddle(Node middleNode) {
        if(middleNode.next != null){
            middleNode.data = middleNode.next.data;
            middleNode.next = middleNode.next.next;
            return true;
        }
        else {
            return false; // Can not delete if this is the last Node
        }
        
    }
    
    public static void main(String args[]){
        
        Q3_DeleteMiddle newClass = new Q3_DeleteMiddle();
        
        Node n = new Node(1);
        Node head = n;
        
        for(int i = 2; i < 10; i++){
            Node m = new Node(i);
            n.next = m;
            n = n.next;
        }
//        head.printList();
        int j = 0;
        n = head;
        Node findNode = null;
        while(j < 3){
            findNode = n.next;
            n = findNode;
            j = j + 1;
            System.out.println(j);
        }       // Remove 4th Element
        System.out.print("(1)Initial List: ");
        head.printList();
        
        boolean bool = newClass.deleteMiddle(findNode);
        

        System.out.println();
        System.out.print("(1)Final List: ");
        head.printList();
        System.out.println();

        
        
        
//        System.out.println("Print Something");
    }
}
