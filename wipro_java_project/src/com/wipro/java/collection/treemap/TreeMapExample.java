package com.wipro.java.collection.treemap;

import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        // Creating a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // put() - Insert key-value pairs
        treeMap.put(3, "Apple");
        treeMap.put(1, "Banana");
        treeMap.put(2, "Cherry");
        treeMap.put(5, "Mango");
        treeMap.put(4, "Orange");

        System.out.println("TreeMap: " + treeMap);

        // get() - Retrieve a value by key
        System.out.println("\nValue for key 3: " + treeMap.get(3));

        // containsKey() - Check if a key exists
        System.out.println("\nContains key 2? " + treeMap.containsKey(2));

        // containsValue() - Check if a value exists
        System.out.println("\nContains value 'Mango'? " + treeMap.containsValue("Mango"));

        // remove() - Remove an entry by key
        treeMap.remove(4);
        System.out.println("\nAfter removing key 4: " + treeMap);

        // size() - Get the number of key-value pairs
        System.out.println("\nSize of TreeMap: " + treeMap.size());

        // keySet() - Get all keys
        System.out.println("\nKeys: " + treeMap.keySet());

        // values() - Get all values
        System.out.println("\nValues: " + treeMap.values());

        // firstKey() - Get the first (smallest) key
        System.out.println("\nFirst Key: " + treeMap.firstKey());

        // lastKey() - Get the last (largest) key
        System.out.println("\nLast Key: " + treeMap.lastKey());

        // firstEntry() - Get the first entry
        System.out.println("\nFirst Entry: " + treeMap.firstEntry());

        // lastEntry() - Get the last entry
        System.out.println("\nLast Entry: " + treeMap.lastEntry());

        // higherKey() - Get the smallest key strictly greater than given key
        System.out.println("\nHigher Key than 2: " + treeMap.higherKey(2));

        // lowerKey() - Get the largest key strictly smaller than given key
        System.out.println("\nLower Key than 2: " + treeMap.lowerKey(2));

        // ceilingKey() - Get the smallest key greater than or equal to given key
        System.out.println("\nCeiling Key of 2: " + treeMap.ceilingKey(2));

        // floorKey() - Get the largest key less than or equal to given key
        System.out.println("\nFloor Key of 2: " + treeMap.floorKey(2));

        // subMap() - Get a portion of the map (inclusive of start, exclusive of end)
        System.out.println("\nSubMap (1 to 4): " + treeMap.subMap(1, 4));

        // headMap() - Get entries with keys less than the given key
        System.out.println("\nHeadMap (< 3): " + treeMap.headMap(3));

        // tailMap() - Get entries with keys greater than or equal to given key
        System.out.println("\nTailMap (>= 3): " + treeMap.tailMap(3));

        // entrySet() - Iterate through the TreeMap
        System.out.println("\nTreeMap Entries:");
        for(Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // clear() - Remove all elements
        treeMap.clear();
        System.out.println("\nTreeMap after clear(): " + treeMap);
    }
}

