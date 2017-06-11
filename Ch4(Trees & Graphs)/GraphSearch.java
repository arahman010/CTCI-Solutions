// Date: 06/11/2017
// Problem
// Question: DFS and BFS implementation

// Assumption Made:

// Time Complexity -->
// Space Complexity -->

// Import necessary libraries
import java.io.*;
import java.util.*;

// Declare Class Name
public class GraphSearch {
    
    // Constructor
    public GraphSearch() {
        
    }
    
    
    // Function which is the solution to the problem
    public void DFSsearch(Node root) {
        if(root == null){
            return;
        }
        // Visit(root);
        root.visited = true;
        for(int i = 0; i < root.adj.length; i++){
            if(!root.adj[i].visited){
                DFSsearch(root.adj[i]);
            }
        }
    
    }
    
    public void BFSsearch(Node root) {
        Queue<Node> Q = new LinkedList<Node>();     // Queue is an interface in Java
        Q.add(root);
        while(!Q.isEmpty()){
            Node n = Q.remove();
            // Visit(node);
            n.visited = true;
            for(int i =0; i < n.adj.length; i++){
                if(!n.adj[i].visited){
                    Q.add(n.adj[i]);
                }
            }
        }
        
    }
    
//    public static void main(String args[]){
//        
//        FileName newClass = new FileName();
//        
//        System.out.println("Print Something");
//    }
}
