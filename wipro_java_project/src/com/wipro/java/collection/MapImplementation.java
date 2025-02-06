/**
 * 
 */
package com.wipro.java.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 */
public class MapImplementation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a HashMap
        Map<Integer, String> map = new HashMap<>();

        // Put elements into the map
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");
        
        // Get an element from the map
        System.out.println("Value for key 2: " + map.get(2));

        // Remove an element from the map
        map.remove(1);
        System.out.println("After removing key 1: " + map);

        // Iterate 
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

	}

}
