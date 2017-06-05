// Date: 06/05/2017
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
    public void deleteDups1(Node head) {
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
    
    public void deleteDups2(Node head) {
        if(head.next == null)
            return;
        
        Node current = head;
        
        
        while(current != null) {
            Node runner = current;
            
            while(runner.next != null) {
                if(runner.next.data == current.data) {
                    runner.next = runner.next.next;
                }
                else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }
    
    public static void main(String args[]){
        
        Q1_deleteDups newClass = new Q1_deleteDups();
        
        Node n = new Node(1);
        Node newNode = n;
        
        for(int i = 2; i < 10; i++){
            Node m = new Node(i%4);
            n.next = m;
            n = n.next;
        }
        

        
    /*    System.out.print("(1)Initial List: ");
        newNode.printList();
        
        newClass.deleteDups1(newNode);
        System.out.println();
        System.out.print("(1)Final List: ");
        newNode.printList();
        System.out.println();       */
        
        // For 2
        
        System.out.print("(2)Initial List: ");
        newNode.printList();
        
        newClass.deleteDups2(newNode);
        System.out.println();
        System.out.print("(2)Final List: ");
        newNode.printList();
        System.out.println();
        
    }
}
