/**
 * 
 */
package com.wipro.java.collection;

/**
 * 
 */
import java.util.Comparator;

public class NameComparator implements Comparator<Animal1> {
 
    public int compare(Animal1 a1, Animal1 a2) {
        return a1.getName().compareTo(a2.getName()); // Alphabetical order
    }
}

