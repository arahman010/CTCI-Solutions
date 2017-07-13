// Date:
// Problem
// Question:

// Assumption Made:

// Time Complexity -->
// Space Complexity -->

// Import necessary libraries
import java.io.*;

// Declare Class Name
public class Node {
    public String name;
    public Node[] adj;
    public boolean visited;
    public State state;
    
    // Constructor
    public Node() {
        visited = false;
    }
    
    public Node(String s) {
        name = s;
        visited = false;
    }
    
}
