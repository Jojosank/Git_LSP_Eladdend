package org.howard.edu.lsp.assignment4;
import java.util.ArrayList;


public class Driver {

 public static void main(String[] args) throws IntegerSetException {
        
    // Test Case 1: Default Constructor
	IntegerSet setA = new IntegerSet();
	setA.add(8);  //
	
	// Test Case 2: Constructor with initialized set
	ArrayList<Integer> initialSet = new ArrayList<>();
	initialSet.add(9);
	initialSet.add(1);
	initialSet.add(3);
	IntegerSet setB = new IntegerSet(initialSet);
	 
	 // String representation of the sets defined
	System.out.println("Set A: " + setA.toString());
	System.out.println("Set B: " + setB.toString() + System.lineSeparator());
	 
	 
	 // Test Case 3: clear()
	 setA.clear();
	System.out.println("Set A after clear(): " + setA + System.lineSeparator()); // must print []
	
	 // Test Case 4: length()
	System.out.println("Length of set B: " + setB.length() + System.lineSeparator()); // must print 3
	
	 // Test Case 5: equals()
	System.out.println("Are setA and setB equal? " + setA.equals(setB) + System.lineSeparator()); // must print false
	
	 // Test Case 6: contains()
	System.out.println("Does setB contain 1? " + setB.contains(1) + System.lineSeparator()); // must print true
	
	 // Test Case 7: largest()
	 try {
	System.out.println("Largest element in setB: " + setB.largest() + System.lineSeparator()); // must print 9
	 } catch (IntegerSetException e) {
	 e.printStackTrace();
	 }
	
	 // Test Case 8: smallest()
	 try {
	System.out.println("Smallest element in setB: " + setB.smallest() + System.lineSeparator()); // must print 1
	 } catch (IntegerSetException e) {
	 e.printStackTrace();
	 }
	
	 // Test Case 9: add()
	 setA.add(9);
	 setA.add(2);
	 setA.add(5);
	 setA.add(2); // Adding a duplicate element
	System.out.println("Set A after adding elements 9, 2, 5, 2: " + setA + System.lineSeparator()); // must print [9, 2, 5]
	
	 // Test Case 10: remove()
	 setA.remove(2);
	System.out.println("Set A after removing 2: " + setA); // must print [9, 5]
	 
	
	System.out.println("Set A: " + setA.toString());
	System.out.println("Set B: " + setB.toString() + System.lineSeparator());
	 
	 // Test Case 11: union()
	 setA.union(setB);
	System.out.println("Union of setA and setB: " + setA); // must print [9, 5, 1, 3]
	 
	 // String representation of the sets defined
	System.out.println("Set A: " + setA.toString());
	System.out.println("Set B: " + setB.toString() + System.lineSeparator());
	
	 
	 // Test Case 12: intersect()
	 setA.intersect(setB);
	System.out.println("Intersection of setA and setB: " + setA); // must print [9, 1, 3]
	 
	System.out.println("Set A: " + setA.toString());
	System.out.println("Set B: " + setB.toString() + System.lineSeparator());
	
	 
	 // Test Case 13: diff()
	 setA.diff(setB);
	System.out.println("Set difference (setA - setB): " + setA); // must print []
	 
	System.out.println("Set A: " + setA.toString());
	System.out.println("Set B: " + setB.toString() + System.lineSeparator());
	
	 
	 // Test Case 14: isEmpty()
	System.out.println("Is setA empty? " + setA.isEmpty() + System.lineSeparator()); // must print true
	 
	 // Test Case 15: complement()
	 
	 IntegerSet universalSet = new IntegerSet();
	 IntegerSet setC = new IntegerSet();
	 setC.add(9);
	 setC.add(6);
	 for (int i = 1; i <= 10; i++) {
	 universalSet.add(i);
	 }
	 // String representation of the sets defined
	System.out.println("Set C : " + setC.toString());
	System.out.println("Universal set: " + universalSet.toString());
	 setC.complement(universalSet);
	System.out.println("Complement of setC in universal set: " + setC); // must print [1, 2, 3, 4, 5, 7, 8, 10]

 
 }
    }
