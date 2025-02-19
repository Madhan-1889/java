package com.wipro.java.collection;

import java.util.*;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", salary=" + salary + '}';
    }
}

// Comparator to sort employees by salary in ascending order
class SalaryComparatorAsc implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Double.compare(e1.getSalary(), e2.getSalary());
    }
}

// Comparator to sort employees by salary in descending order
class SalaryComparatorDesc implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Double.compare(e2.getSalary(), e1.getSalary());
    }
}

public class LinkedListComparatorExample {
    public static void main(String[] args) {
        LinkedList<Employee> employees = new LinkedList<>();
        
        employees.add(new Employee(101, "Madhan", 60000));
        employees.add(new Employee(102, "Kavin", 75000));
        employees.add(new Employee(103, "Vicky", 50000));
        employees.add(new Employee(104, "Jevan", 90000));

        System.out.println("Before Sorting:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        // Sorting in ascending order using Comparator
        Collections.sort(employees, new SalaryComparatorAsc());
        System.out.println("\nAfter Sorting by Salary (Ascending):");
        for (Employee e : employees) {
            System.out.println(e);
        }

        // Sorting in descending order using Comparator
        Collections.sort(employees, new SalaryComparatorDesc());
        System.out.println("\nAfter Sorting by Salary (Descending):");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}

