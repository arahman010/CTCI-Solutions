// Date:
// Problem
// Question:

// Assumption Made:

// Time Complexity -->
// Space Complexity -->

// Import necessary libraries
import java.io.*;
import java.util.*;

// Declare Class Name
public class Q8_LoopDetection {
    
    // Constructor
    public Q8_LoopDetection() {
        
    }
    
    
    // Function which is the solution to the problem
    public Node getLoopStart(Node head) {
        Node slow = head;
        Node fast = head;

        // Be very careful about this mistake ***
        slow = slow.next;
        fast = fast.next.next;

        
        while(fast != null && fast.next != null && slow.data != fast.data){
            // System.out.print("slow Node: " + Integer.toString(slow.data) + ", ");
            // System.out.print("fast Node: " + Integer.toString(fast.data));
            // System.out.println();
            slow = slow.next;
            fast = fast.next.next;

        }

        if(fast == null || fast.next == null){
            // No Loop
            return null;
        }

        // Node collisionNode = slow;

        fast = head;

        // move both of them at the same speed

        while(slow.data != fast.data){
            // System.out.println("Second Iteration:");
            // System.out.print("slow Node: " + Integer.toString(slow.data) + ", ");
            // System.out.print("fast Node: " + Integer.toString(fast.data));
            // System.out.println();
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
    
    public static void main(String args[]){
        
        Q8_LoopDetection newClass = new Q8_LoopDetection();

        Node n = new Node(1);
        Node head = n;
        Node loopNode = null;
        
        for(int i = 2; i <= 10; i++){
            Node m = new Node(i);
            if(i == 5){
                loopNode = m;
            }
            n.next = m;
            n = n.next;
        }
        head.printList();
        //To create a loop
        n.next = loopNode;

        // System.out.println(loopNode.data);

        Node result = newClass.getLoopStart(head);

        if(result != null){
            System.out.println("Loop Node is: " + Integer.toString(result.data));
        }
        else {
            System.out.println("No loop in the input");
        }
        
        
    }
}
