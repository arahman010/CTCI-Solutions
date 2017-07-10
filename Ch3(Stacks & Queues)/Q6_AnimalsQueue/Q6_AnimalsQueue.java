// Date: 09/07/2017
// Problem
// Question: Implement AnimalQueue class which provides Cats and Dogs on first come fist basis.

// Assumption Made:

// Time Complexity -->
// Space Complexity -->

// Import necessary libraries
import java.io.*;
import java.util.*;



// Declare Class Name
public class Q6_AnimalsQueue {

    private MyQueue<Animal> cats;
    private MyQueue<Animal> dogs;
    private int order;
    
    // Constructor
    public Q6_AnimalsQueue() {
        cats = new MyQueue<Animal>();
        dogs = new MyQueue<Animal>();
        order = 0;
    }
    
    
    //add
    public void add(Animal item){
        order++;
        item.setOrder(order);
        if(item instanceof Cat){
            cats.add(item);
        }
        else {
            dogs.add(item);
        }
        
    }

    //remove
    public Animal remove(){
        Animal firstCat = cats.peek();
        Animal firstDog = dogs.peek();
        if(firstCat.isOlderThan(firstDog)){
            return cats.remove();
        }
        else {
            return dogs.remove();
        }
        
    }

    //peek
    public Animal peek(){
        Animal firstCat = cats.peek();
        Animal firstDog = dogs.peek();
        if(firstCat.getOrder() > firstDog.getOrder()){
            return firstCat;
        }
        else {
            return firstDog;
        }
    }
    
    //isEmpty
    public boolean isEmpty(){
        return cats.isEmpty() && dogs.isEmpty();
    }
    
    public void printQueue() {
        System.out.print("Dogs : ");
        dogs.printQueue();
        System.out.print("Cats : ");
        cats.printQueue();
    }
    
    public static void main(String args[]){
        
        Q6_AnimalsQueue newClass = new Q6_AnimalsQueue();
        
        Cat c1 = new Cat("c1");
        Cat c2 = new Cat("c2");
        Cat c3 = new Cat("c3");

        Dog d1 = new Dog("d1");
        Dog d2 = new Dog("d2");
        Dog d3 = new Dog("d3");

        newClass.add(c1);
        newClass.add(d3);
        newClass.add(c3);
        newClass.add(d2);
        newClass.add(c2);
        newClass.add(d1);

        newClass.printQueue();
        newClass.remove();

        newClass.printQueue();
        newClass.remove();

        newClass.printQueue();

        
    }
}
