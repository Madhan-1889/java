package com.wipro.java.practice;

import java.util.Scanner;

//Generic Linked List Node class
class Node<T> {
 T data;
 Node<T> next;

 public Node(T data) {
     this.data = data;
     this.next = null;
 }
}

//Generic Stack class using Linked List
class Stack<T> {
 private Node<T> top;

 // Constructor
 public Stack() {
     this.top = null;
 }

 // Pushes the item to the stack
 public void push(T item) {
     Node<T> newNode = new Node<>(item);
     newNode.next = top;
     top = newNode;
 }

 // Pops the item from the stack
 public T pop() {
     if (top == null) {
         return null; // Stack is empty
     }
     T item = top.data;
     top = top.next;
     return item;
 }

 // Peeks at the top item without removing it
 public T peek() {
     if (top == null) {
         return null; // Stack is empty
     }
     return top.data;
 }

 // Checks if the stack is empty
 public boolean isEmpty() {
     return top == null;
 }
}

public class UseCase2 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     // Integer stack
     Stack<Integer> integerStack = new Stack<>();

     // Read integers for the stack
     System.out.println("Enter integers to push onto the stack (non-integer to stop):");
     while (scanner.hasNextInt()) {
         int userInput = scanner.nextInt();
         integerStack.push(userInput);
     }

     // Display integer stack operations
     System.out.println("Operations on Integer Stack:");
     System.out.println("Peek: " + integerStack.peek());
     System.out.println("Pop: " + integerStack.pop());
     System.out.println("Is Empty: " + integerStack.isEmpty());
     System.out.println("Pop: " + integerStack.pop());
     System.out.println("Pop: " + integerStack.pop());
     System.out.println("Is Empty: " + integerStack.isEmpty());

     // Clear scanner buffer
     scanner.nextLine(); // Consume the newline

     // String stack
     Stack<String> stringStack = new Stack<>();

     // Read strings for the stack
     System.out.println("Enter strings to push onto the stack (empty string to stop):");
     while (true) {
         String userInput = scanner.nextLine();
         if (userInput.isEmpty()) {
             break;
         }
         stringStack.push(userInput);
     }

     // Display string stack operation
     System.out.println("Peek: " + stringStack.peek());

     // Close the scanner
     scanner.close();
 }
}