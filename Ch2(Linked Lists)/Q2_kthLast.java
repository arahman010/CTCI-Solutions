// Date:
// Problem
// Question:

// Assumption Made:

// Time Complexity -->
// Space Complexity -->

// Import necessary libraries
import java.io.*;

// Declare Class Name
public class Q2_kthLast {
    
    // Constructor
    public Q2_kthLast() {
        
    }
    
    
    // Function which is the solution to the problem
    public Node kthLast(Node head, int k) {
        Node n = head;
        int length = 0;
        while(n.next!= null){
            length++;
            n = n.next;
        }
        System.out.println("length: " + length);
        int diff = length - k;
        Node m = head;
        for(int i =0 ; i < diff; i++) {
            m = m.next;
        }
        return m;
    
    }
    
    public static void main(String args[]){
        
        Q2_kthLast newClass = new Q2_kthLast();
        
        Node n = new Node(1);
        Node newNode = n;
        
        for(int i = 2; i < 10; i++){
            Node m = new Node(i);
            n.next = m;
            n = n.next;
        }
        
        System.out.print("(1)Initial List: ");
        newNode.printList();
        
        Node result = newClass.kthLast(newNode,4);
        System.out.println();
        System.out.print("(1)Final List: ");
        result.printList();
        System.out.println();

    }
}
