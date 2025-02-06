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
public class Animal implements Comparable<Animal> {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Implementing the compareTo method to compare by age
    @Override
    public int compareTo(Animal other) {
        return Integer.compare(this.age, other.age); // Ascending order
    }
    
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Tiger", 8));
        animals.add(new Animal("Elephant", 25));
        animals.add(new Animal("Dog", 5));
        animals.add(new Animal("Cat", 3));

        System.out.println("Before Sorting:");
        for (Animal a : animals) {
            System.out.println(a);
        }

        // Sorting animals by age (default Comparable sorting)
        Collections.sort(animals);

        System.out.println("\nAfter Sorting By Age :");
        for (Animal a : animals) {
            System.out.println(a);
        }
    }
}

