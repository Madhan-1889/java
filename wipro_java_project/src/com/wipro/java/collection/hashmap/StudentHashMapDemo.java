package com.wipro.java.collection.hashmap;

import java.util.*;

class Student {
    private String name;
    private int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', rollNumber=" + rollNumber + "}";
    }
}

public class StudentHashMapDemo {
    public static void main(String[] args) {
        Map<Integer, List<Student>> studentMap = new HashMap<>();

        // Adding students
        addStudent(studentMap, new Student("Madhan", 101));
        addStudent(studentMap, new Student("Sukanth", 102));
        addStudent(studentMap, new Student("Kayal", 103));
        addStudent(studentMap, new Student("Madhan", 101)); // Duplicate
        addStudent(studentMap, new Student("David", 104));
        addStudent(studentMap, new Student("Eve", 105));
        addStudent(studentMap, new Student("Frank", 106));
        addStudent(studentMap, new Student("Kayal", 103)); // Duplicate
        addStudent(studentMap, new Student("Grace", 107));
        addStudent(studentMap, new Student("Sukanth", 102)); // Duplicate

        // Displaying students
        for (Map.Entry<Integer, List<Student>> entry : studentMap.entrySet()) {
            System.out.println("Roll Number: " + entry.getKey() + " -> " + entry.getValue());
        }
    }

    private static void addStudent(Map<Integer, List<Student>> map, Student student) {
        map.computeIfAbsent(student.getRollNumber(), k -> new ArrayList<>()).add(student);
    }
}

