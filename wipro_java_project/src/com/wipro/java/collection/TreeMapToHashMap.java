package com.wipro.java.collection;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapToHashMap {
    public static void main(String[] args) {
        // Creating a TreeMap with sample data (sorted order)
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(101, "Java");
        treeMap.put(103, "C");
        treeMap.put(105, "C++");
        treeMap.put(102, "Python");
        treeMap.put(104, "C#");

        // Displaying the TreeMap (Sorted Order)
        System.out.println("TreeMap (Sorted Order): " + treeMap);

        // Transferring data to a HashMap
        HashMap<Integer, String> hashMap = new HashMap<>(treeMap);

        // Displaying the HashMap (Unordered)
        System.out.println("HashMap (Unordered): " + hashMap);
    }
}

