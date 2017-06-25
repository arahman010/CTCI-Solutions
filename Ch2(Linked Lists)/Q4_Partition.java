// Date:
// Problem
// Question:

// Assumption Made:

// Time Complexity -->
// Space Complexity -->

// Import necessary libraries
import java.io.*;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;



// Declare Class Name
public class Q4_Partition {
    
    // Constructor
    public Q4_Partition() {
        
    }
    
    
    // Function which is the solution to the problem
    public Node makePartition(Node head, int pivot) {
        Node temp = head;
        if(head == null){
            return head;
        }
        while(temp.next != null){
            if(temp.next.data < pivot){
                // Make a new node and put it in the head
                Node reserveNode = temp.next;
                temp.next = temp.next.next;
                reserveNode.next = head;
                head = reserveNode;
            }
            else {
                temp = temp.next;       // UPDATE ONLY WHEN NOT CHANGING ANY DATA... OTHERWISE IT IS UPDATED TO NEXT AUTOMATICALLY IN THE IF
            }
        }
        return head;
    }
    
    public static void main(String args[]){
        
        Q4_Partition newClass = new Q4_Partition();
        
        Node n = new Node(1);
        Node head = n;
        int randomNum = 0;
        for(int i = 2; i < 10; i++){
            randomNum = ThreadLocalRandom.current().nextInt(0, 20 + 1);
            Node m = new Node(randomNum);
            n.next = m;
            n = n.next;
        }
        
        randomNum = ThreadLocalRandom.current().nextInt(0, 10 + 1);
        
        System.out.print("(1)Initial List: ");
        head.printList();
        System.out.printf("Pivot: %d",randomNum);
        System.out.println();
        
        
        head = newClass.makePartition(head,randomNum);
        
        
        System.out.println();
        System.out.print("(1)Final List: ");
        head.printList();
        System.out.println();


        
        
        
        
        
//        System.out.println("Print Something");
    }
}
