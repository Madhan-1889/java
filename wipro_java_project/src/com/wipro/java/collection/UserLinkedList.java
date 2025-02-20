package com.wipro.java.collection;

import java.util.Scanner;

//Node class representing each element in the Linked List
class Node {
 int data;
 Node next;

 public Node(int data) {
     this.data = data;
     this.next = null;
 }
}

//LinkedList class with basic operations
class LinkedList {
 private Node head;

 // Method to add a node at the end
 public void add(int data) {
     Node newNode = new Node(data);
     if (head == null) {
         head = newNode;
     } else {
         Node temp = head;
         while (temp.next != null) {
             temp = temp.next;
         }
         temp.next = newNode;
     }
 }

 // Method to delete a node by value
 public void delete(int data) {
     if (head == null) {
         System.out.println("List is empty.");
         return;
     }
     if (head.data == data) {
         head = head.next;
         return;
     }

     Node temp = head;
     Node prev = null;
     while (temp != null && temp.data != data) {
         prev = temp;
         temp = temp.next;
     }

     if (temp == null) {
         System.out.println("Element not found.");
         return;
     }

     prev.next = temp.next;
 }

 // Method to display the linked list
 public void display() {
     if (head == null) {
         System.out.println("List is empty.");
         return;
     }

     Node temp = head;
     System.out.print("Linked List: ");
     while (temp != null) {
         System.out.print(temp.data + " -> ");
         temp = temp.next;
     }
     System.out.println("null");
 }
}

//Main class for user interaction
public class UserLinkedList {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     LinkedList list = new LinkedList();

     while (true) {
         System.out.println("\n1. Add Node");
         System.out.println("2. Delete Node");
         System.out.println("3. Display List");
         System.out.println("4. Exit");
         System.out.print("Enter choice: ");
         int choice = scanner.nextInt();

         switch (choice) {
             case 1:
                 System.out.print("Enter value to add: ");
                 int value = scanner.nextInt();
                 list.add(value);
                 break;
             case 2:
                 System.out.print("Enter value to delete: ");
                 int deleteValue = scanner.nextInt();
                 list.delete(deleteValue);
                 break;
             case 3:
                 list.display();
                 break;
             case 4:
                 System.out.println("Exiting...");
                 scanner.close();
                 return;
             default:
                 System.out.println("Invalid choice. Try again.");
         }
     }
 }
}
