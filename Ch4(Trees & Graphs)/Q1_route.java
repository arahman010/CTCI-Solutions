// Date: 06/11/2017
// Problem
// Question: 4.1 Given a directed graph, design an algorithm to find out whether there is a route between two nodes                                                                                                           

// Assumption Made:

// Time Complexity -->
// Space Complexity -->

// Import necessary libraries
import java.io.*;

// Declare Class Name
public class Q1_route {
    
    // Constructor
    public Q1_route() {

    }
    
    
    // Function which is the solution to the problem
    public boolean route(Node A, Node B) {
        if ( A == null)
            return false;
        else if ( A == B )
            return true;
        
        A.visited = true;
        boolean result = false;
        for(int i = 0; i < A.adj.length; i++) {
            Node a = A.adj[i];
            if(a.visited == false) {
                a.visited = true;
                result = route(a, B);
                if (result)
                    break;
            }
        }
        
        return result;
    }
    
    public static void main(String args[]){
        
        Q1_route newClass = new Q1_route();
        
        Node A = new Node("A");
        Node B = new Node("B");
        Node C = new Node("C");
        Node D = new Node("D");
        Node E = new Node("E");
        Node F = new Node("F");
        
        A.adj = new Node[1];
        A.adj[0] = D;
        
        B.adj = new Node[1];
        B.adj[0] = null;
        
        C.adj = new Node[2];
        C.adj[0] = E;
        C.adj[1] = F;
        
        D.adj = new Node[1];
        D.adj[0] = C;
        
        E.adj = new Node[1];
        E.adj[0] = B;
        
        F.adj = new Node[1];
        F.adj[0] = A;
        
        boolean rslt = newClass.route(A,B);
        
        if (rslt)
            System.out.println("Node A & B has route");
        else
            System.out.println("Node A & B does not have route");
        

    }
}
