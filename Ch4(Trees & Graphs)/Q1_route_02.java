// Date: 07/12/2017
// Problem 4.1 
// Question: Given a directed graph, design an algorithm to find out whether there is a route between two nodes     

// Assumption Made:

// Time Complexity -->
// Space Complexity -->

// Import necessary libraries
import java.io.*;
import java.util.*;

// Declare Class Name
public class Q1_route_02 {
    
    // Constructor
    public Q1_route_02() {
        
    }
    
    // public enum State{ Unvisited, Visited, Visiting };
    
    // Function which is the solution to the problem
    public boolean serachForNode(Graph g, Node start, Node end) {
        if(start == end){
            return true;
        }

        LinkedList<Node> q = new LinkedList<Node>();

        for(Node u : g.getNodes()){
            u.state = State.Unvisited;
        }

        start.state = State.Visiting;
        q.addFirst(start);      // Enque

        Node u;
        while(!q.isEmpty()){
            u = q.removeFirst();        // Deque
            if(u != null){
                for(Node v: u.adj){
                    if(v.state == State.Unvisited){
                        if(v == end){
                            return true;
                        }
                        else {
                            v.state = State.Visiting;
                            q.add(v);
                        }
                    }
                }
                u.state = State.Visited;
            }
        }
        return false;
        
    }
    
    public static void main(String args[]){
        
        Q1_route_02 newClass = new Q1_route_02();
        
        System.out.println("Print Something");
    }
}
