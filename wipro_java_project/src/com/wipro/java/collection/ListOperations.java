/**
 * 
 */
package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class ListOperations {
	
	public static void main(String[] args) {
        // Initialize the first list
        List<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        
        // Initialize the second list
        List<Integer> l2 = new ArrayList<>();
        l2.add(100);
        l2.add(200);
        l2.add(300);

        // Add all elements of l2 to l1 starting from index 1
        l1.addAll(1, l2);
        System.out.println("After addAll: " + l1);

        // Remove the element at index 1
        l1.remove(1);
        System.out.println("After remove: " + l1);

        // Set index 0 to value 5
        l1.set(0, 5);
        System.out.println("After set: " + l1);
    }

}
