package com.wipro.java.collection.hashmap;

import java.util.LinkedList;

//Node class to store key-value pairs
class Entry<K, V> {
 K key;
 V value;

 public Entry(K key, V value) {
     this.key = key;
     this.value = value;
 }
}

//Custom HashMap implementation
class MyHashMap<K, V> {
 private static final int SIZE = 10; // Default bucket size
 private LinkedList<Entry<K, V>>[] buckets;

 // Constructor
 @SuppressWarnings("unchecked")
 public MyHashMap() {
     buckets = new LinkedList[SIZE];
     for (int i = 0; i < SIZE; i++) {
         buckets[i] = new LinkedList<>();
     }
 }

 // Hash function to get index
 private int getIndex(K key) {
     return Math.abs(key.hashCode() % SIZE);
 }

 // Put method to insert key-value pair
 public void put(K key, V value) {
     int index = getIndex(key);
     LinkedList<Entry<K, V>> bucket = buckets[index];

     for (Entry<K, V> entry : bucket) {
         if (entry.key.equals(key)) {
             entry.value = value; // Update value if key exists
             return;
         }
     }

     bucket.add(new Entry<>(key, value)); // Insert new entry
 }

 // Get method to retrieve value by key
 public V get(K key) {
     int index = getIndex(key);
     LinkedList<Entry<K, V>> bucket = buckets[index];

     for (Entry<K, V> entry : bucket) {
         if (entry.key.equals(key)) {
             return entry.value;
         }
     }

     return null; // Key not found
 }

 // Remove method to delete key-value pair
 public void remove(K key) {
     int index = getIndex(key);
     LinkedList<Entry<K, V>> bucket = buckets[index];

     for (Entry<K, V> entry : bucket) {
         if (entry.key.equals(key)) {
             bucket.remove(entry);
             return;
         }
     }
 }

 // Display method to print the HashMap
 public void display() {
     for (int i = 0; i < SIZE; i++) {
         System.out.print("Bucket " + i + ": ");
         for (Entry<K, V> entry : buckets[i]) {
             System.out.print("[" + entry.key + " = " + entry.value + "] ");
         }
         System.out.println();
     }
 }
}

//Main class for testing
public class CustomHashMap {
 public static void main(String[] args) {
     MyHashMap<Integer, String> map = new MyHashMap<>();

     // Inserting key-value pairs
     map.put(1, "Madhan");
     map.put(2, "Buvan");
     map.put(3, "Charlie");
     map.put(11, "David"); // This will hash to the same index as 1
     map.put(4, "Elango");

     // Display the HashMap
     System.out.println("HashMap contents:");
     map.display();

     // Retrieving values
     System.out.println("\nGet key 2: " + map.get(2));
     System.out.println("Get key 11: " + map.get(11));

     // Removing a key
     System.out.println("\nRemoving key 3...");
     map.remove(3);
     map.display();
 }
}

