/**
 * 
 */
package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 
 */
public class CollectionsExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Using ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Mango");
        
        // Adding all elements from another list
        List<String> moreFruits = Arrays.asList("Grape", "Pineapple");
        arrayList.addAll(moreFruits);
        
        // Removing an element
        arrayList.remove("Banana");
        System.out.println("ArrayList: " + arrayList);
        
        // Setting an element at index 1
        arrayList.set(1, "Orange");
        System.out.println("ArrayList: " + arrayList);

        // Using LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        
        // Removing an element
        linkedList.remove(Integer.valueOf(20));
        
        // Getting an element at index 1
        int value = linkedList.get(1);
        System.out.println(value);
        
        // Adding an element at the beginning
        linkedList.addFirst(5);
        System.out.println("LinkedList: " + linkedList);

        // Using HashMap
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Java");
        hashMap.put(2, "C");
        hashMap.put(3, "Python");
        
        // Removing an element
        hashMap.remove(2);
        
        // Iterating through the map
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

	}

}
