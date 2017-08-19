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
public class Q6_Palindrome {
    
    // Constructor
    public Q6_Palindrome() {
        
    }
    
    
    // Function which is the solution to the problem
    public boolean isPalindrome(Node head) {
        MyStack<Integer> stack = new MyStack<Integer>();

        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            stack.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }

        while(slow != null){
            Integer nodeData = stack.pop();
            if(nodeData != slow.data){
                return false;
            }
            slow = slow.next;
        }

        return true;
    
    }
    
    public static void main(String args[]){
        
        Q6_Palindrome newClass = new Q6_Palindrome();
        
        Node n = new Node(1);
        Node head = n;
        
        for(int i = 2; i < 10; i++){
            Node m = new Node(i);
            n.next = m;
            n = n.next;
        }

        // for(int i = 9; i > 0; i--){
        //     Node m = new Node(i);
        //     n.next = m;
        //     n = n.next;
        // }

        head.printList();

        if(newClass.isPalindrome(head)){
            System.out.println("This LinkedList is Palindrome!");
        
        }
        else {
            System.out.println("This LinkedList is not Palindrome!"); 
        }

        


    }
}
