/**
 * 
 */
package com.wipro.java.oops.abstraction;

/** Parent class - Car
 *  Child Class - Kia
 *  extend is a keyword to implement the abstract class here
 */
public class Kia extends Car{
	
	//implementation of abstract method
	public void typeOfCar() {
		System.out.println("Type Of Car:Kia");
	}
	
	public static void main(String a[]) {
		Kia obj= new Kia(); // creation object reference to access the properties of a class
		obj.typeOfCar(); // calling the method
	}

}
