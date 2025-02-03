/**
 * 
 */
package com.wipro.java.oops.abstraction;

/**
 * 
 */
public class Benz extends Car{
	
	public void typeOfCar() {
		System.out.println("Type Of Car:Benz");
	}
	
	public static void main(String a[]) {
		Car obj= new Benz();
		obj.typeOfCar();
	}

}
