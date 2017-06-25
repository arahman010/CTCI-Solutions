// Date:
// Problem
// Question:

// Assumption Made: Both of the input are positive numbers // Only the first is done here

// Time Complexity -->
// Space Complexity -->

// Import necessary libraries
import java.io.*;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

// Declare Class Name
public class Q5_SumLists {
    
    // Constructor
    public Q5_SumLists() {
        
    }
    
    
    // Function which is the solution to the problem
    public Node sumLists(Node head1, Node head2) {
        int sum = 0;
        sum = sum + getInt(head1) + getInt(head2);
//        System.out.println();
//        System.out.println(getInt(head1));
//        
//        System.out.println();
//        System.out.println(getInt(head2));
        if ( sum != 0){
//            System.out.println();
//            System.out.println(sum);
            return makeList(sum);
        }
        else {
            return null;
        }

    }
    
    public int getInt(Node head){   // Reverse
        int rslt = 0;
        int pow = 0;
        while(head != null){
            rslt = rslt + (head.data * (int) Math.pow(10,pow));
            head = head.next;
            pow++;
        }
        return rslt;
    }
    
    public Node makeList(int input){        // Reverse
        Node head = new Node(input%10);
        Node temp = head;
        input = input/10;
        
        while(input!=0){
            Node newNode = new Node(input%10);
            temp.next = newNode;
            temp = temp.next;
            input = input / 10;
        }
        
        return head;
        
        
    }
    public static void main(String args[]){
        
        Q5_SumLists newClass = new Q5_SumLists();
        
        Node n = new Node(1);
        Node head1 = n;
        int randomNum = 0;
        for(int i = 2; i < 5; i++){
            randomNum = ThreadLocalRandom.current().nextInt(0, 8 + 1);
            Node m = new Node(randomNum);
            n.next = m;
            n = n.next;
        }
        
        n = new Node(1);
        Node head2 = n;
        randomNum = 0;
        for(int j = 2; j < 5; j++){
            randomNum = ThreadLocalRandom.current().nextInt(0, 8 + 1);
            Node m2 = new Node(randomNum);
            n.next = m2;
            n = n.next;
        }
        
        System.out.print("(1)Initial List: ");
        head1.printList();
        System.out.println();
        System.out.print("(2)Initial List: ");
        head2.printList();
        System.out.println();
//        System.out.printf("Pivot: %d",randomNum);
//        System.out.println();
        
        
        Node head = newClass.sumLists(head1,head2);
        
        
        System.out.println();
        System.out.print("(1)Final List: ");
        head.printList();
        System.out.println();
    }
}
