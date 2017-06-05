// Date:
// Problem
// Question: Write code to delete duplicates from an unsorted linked list.
// How would you solve this problem if a temporary buffer is not allowed?

// Assumption Made: Linked list contains integer. Implemented using Nodes rather than the linked list data structure

// Time Complexity --> O(n) || O(n^2)
// Space Complexity --> O(n) || O(1)

// Import necessary libraries
import java.io.*;
import java.util.*;
//import Node;

// Declare Class Name
public class Q1_deleteDups {
    
    // Constructor
    public Q1_deleteDups() {
    }
    
    
    // Function which is the solution to the problem
    public void deleteDups(Node head) {
        if(head.next == null)
            return;
        
        HashSet<Integer> set = new HashSet<Integer>();
        Node n = head;
        set.add(n.data);
        
        while(n.next != null) {
            if(set.contains(n.next.data)) {
                n.next = n.next.next;
            }
            else {
                set.add(n.next.data);
                n = n.next;
            }
        }
        return;
    }
    
    public static void main(String args[]){
        
        Q1_deleteDups newClass = new Q1_deleteDups();
        
        Node newNode = new Node(1);
        Node n = newNode;
        
        for(int i = 2; i < 10; i++){
            Node m = new Node(i);
            n.next = m;
            n = n.next;
        }
        
        Node m = new Node(5);
        n.next = m;
        n = n.next;
        
        System.out.print("Initial List: ");
        newNode.printList();
        
        newClass.deleteDups(n);
        
        System.out.print("Final List: ");
        newNode.printList();
        
    }
}
