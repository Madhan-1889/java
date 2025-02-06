/**
 * 
 */
package com.wipro.java.collection;

/**
 * 
 */
import java.util.Comparator;

public class AgeComparator implements Comparator<Animal1> {

    public int compare(Animal1 a1, Animal1 a2) {
        return Integer.compare(a1.getAge(), a2.getAge()); // Ascending order
    }
}
