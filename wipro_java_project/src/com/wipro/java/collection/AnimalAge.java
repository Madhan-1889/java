/**
 * 
 */
package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 */
public class AnimalAge{
	
	public static void main(String[] args) {
        List<Animal1> animals = new ArrayList<>();
        animals.add(new Animal1("Tiger", 10));
        animals.add(new Animal1("Elephant", 25));
        animals.add(new Animal1("Dog", 5));
        animals.add(new Animal1("Cat", 3));

        System.out.println("Before Sorting:");
        for (Animal1 a : animals) {
            System.out.println("Animal name:"+a.getName()+" Age:"+a.getAge());
        }

        // Sorting by Age using Comparator
        Collections.sort(animals, new AgeComparator());
        System.out.println("\nSorted by Age:");
        for (Animal1 a : animals) {
            System.out.println("Animal name:"+a.getName()+" Age:"+a.getAge());
        }
    }

}