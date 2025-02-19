package com.wipro.java.collection.treemap;

import java.util.Map;
import java.util.TreeMap;

public class FibonacciTreeMap {
    public static void main(String[] args) {
        int n = 10; 
        TreeMap<Integer, Integer> fibonacciMap = new TreeMap<>();
        
        generateFibonacci(n, fibonacciMap);
        
        // Display the Fibonacci series stored in TreeMap
        for (Map.Entry<Integer, Integer> entry : fibonacciMap.entrySet()) {
            System.out.println("Index: " + entry.getKey() + ", Fibonacci Number: " + entry.getValue());
        }
    }

    public static void generateFibonacci(int n, TreeMap<Integer, Integer> map) {
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            map.put(i, a);
            int next = a + b;
            a = b;
            b = next;
        }
    }
}

