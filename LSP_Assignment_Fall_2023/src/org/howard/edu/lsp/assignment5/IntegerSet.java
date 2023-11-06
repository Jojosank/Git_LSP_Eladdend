package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.List;

public class IntegerSet {
    private List<Integer> set = new ArrayList<Integer>();
    
    /**
     * Default Constructor of the IntegerSet class
     */
    public IntegerSet() {
    }

    /**
     * Constructor if you want to pass in already initialized
     * @param set
     */
    public IntegerSet(ArrayList<Integer> set) {
        this.set = set;
    }
    
    /**
     * This method add an integer to the Integer Set if item to be added does not already exist in the set
     * @param item
     */
    public void add(int item) {
        if (!set.contains(item) ) {
            set.add(item);
        }
    }
    /**
     * A void class which clears out the Integer set
     */
    public void clear() {
        set.clear();
    }
    /**
     * This method return the string representation of the Integer set
     * @return String
     */
    public String toString() {
        return set.toString();
    }
    /**
     * This method removes an item from the set if the item exists
     * @param item
     */
    public void remove(int item) {
        if (set.contains(item) ) {
            set.remove(Integer.valueOf(item));
        }
        
    }
    /**
     * This method returns true if the two sets are equal otherwise false
     */
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IntegerSet that = (IntegerSet) o;

        return that.set.containsAll(set) && set.containsAll(that.set);
    }
    /**
     * This method returns the number of elements in the set
     * @return length of the set
     */
    public int length() {
        return set.size();
    }
    /**
     * This method returns true if the set is empty
     * @return boolean
     */
    public boolean isEmpty() {
        return set.isEmpty();
    }
    /**
     * This method returns true if the set contains the value
     * @param value
     * @return boolean
     */
    public boolean contains(int value) {
        return set.contains(value);
    }
    /**
     * This method returns the maximum value in the set
     * @return maximum element
     * @throws IntegerSetException
     */
    public int largest() throws IntegerSetException {
        if (isEmpty()) {
            throw new IntegerSetException("Set is empty");
        }
        int max = Integer.MIN_VALUE;  
        for (int value : set) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
    /**
     * This method returns the minimum value in the set
     * @return smallest element
     * @throws IntegerSetException
     */
    public int smallest() throws IntegerSetException {
        if (isEmpty()) {
            throw new IntegerSetException("Set is empty");
        }
        int min = Integer.MAX_VALUE;
        for (int value : set) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
    /**
     * This method does the union operation on two or more sets
     * @param intSetB
     */
    public void union(IntegerSet intSetB) {
        for (int value : intSetB.set) {
            if (!set.contains(value)) {
                set.add(value);
            }
        }
    }

    /**
     * This method does the intersection operation on two or more sets
     * @param intSetB
     */
    public void intersect(IntegerSet intSetB) {
        set.retainAll(intSetB.set);
    }
    /**
     * This method does the difference operation on two or more sets
     * @param intSetB
     */
    public void diff(IntegerSet intSetB) {
        set.removeAll(intSetB.set);
    }
    /**
     * This method finds the complement when given an universal set 
     * @param Universal set
     */
    public void complement(IntegerSet universalSet) {
        List<Integer> complement = new ArrayList<>();
        for (int i : universalSet.set) {
            if (!set.contains(i)) {
                complement.add(i);
            }
        }
        set = complement;
    }


}

class IntegerSetException extends Exception {

	public IntegerSetException(String message) {
        super(message);
    }
}
