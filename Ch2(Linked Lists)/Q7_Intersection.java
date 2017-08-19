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
public class Q7_Intersection {
    
    // Constructor
    public Q7_Intersection() {
        
    }
    
    
    // Function which is the solution to the problem
    public Node getIntersectionNode(Node head1, Node head2) {
        if(head1 == null || head2 == null){
            return null;
        }
        //Find length of both of the list and check if there is an intersection
        Node iter1 = head1;
        Node iter2 = head2;
        int length1 = 0;
        int length2 = 0;

        while(iter1 != null){
            length1++;
            iter1 =iter1.next;
        }

        while(iter2 != null){
            length2++;
            iter2 =iter2.next;
        }

        if(length1 > length2){
            iter1 = goForwardInList(head1,length1-length2);
            return interSectionForSameLength(iter1,head2);
        }
        else if(length2 > length1){
            iter2 = goForwardInList(head2,length2-length1);
            return interSectionForSameLength(head1,iter2);
        }
        else {
            return interSectionForSameLength(head1,head2);
        }
    
    }

    public Node goForwardInList(Node head, int length){
        for(int i = 0; i < length; i++){
            head = head.next;
        }
        return head;

    }

    public Node interSectionForSameLength(Node head1, Node head2){
        while(head1 != null && head2 != null){
            if(head1.data != head2.data){
                head1 = head1.next;
                head2 = head2.next;
            }
            else {
                return head1;
            }
        }
        return null;
    }
    
    public static void main(String args[]){
        
        Q7_Intersection newClass = new Q7_Intersection();

        Node n = new Node(5);
        Node head1 = n;
        
        for(int i = 6; i < 10; i++){
            Node m = new Node(i);
            n.next = m;
            n = n.next;
        }
        Node temp = n;

        head1.printList();

        n = new Node(1);
        Node head2 = n;
        
        for(int i = 2; i < 5; i++){
            Node m = new Node(i);
            n.next = m;
            n = n.next;
        }
        n.next = head1;

        head2.printList();

        Node result = newClass.getIntersectionNode(head1,head2);

        if (result != null){
            System.out.println("common node is : " + Integer.toString(result.data));
        }
        else {
            System.out.println("No common node");
        }
        
    }
}
