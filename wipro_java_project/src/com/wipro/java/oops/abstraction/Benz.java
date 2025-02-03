/**
 * 
 */
package com.wipro.java.oops.abstraction;

/** Parent class - Car
 *  Child class - Benz
 *  extend is a keyword to implement the abstract class here
 */
public class Benz extends Car{
	
	//implementation of abstract method
	public void typeOfCar() {
		System.out.println("Type Of Car:Benz");
	}
	
	public static void main(String a[]) {
		Car obj= new Benz();// creation object reference to access the properties of a class
		obj.typeOfCar();// calling the method
	}

}
