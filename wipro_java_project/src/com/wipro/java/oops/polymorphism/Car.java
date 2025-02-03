/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 * 
 */
public class Car {
	
	public void mileageCalculation(int mileage) {
		System.out.println("Mileage of the car is "+mileage);
		
	}
	
	public void mileageCalculation(float distance,float fuel) {
		float c=distance/fuel;
		System.out.printf("Mileage of the car is %.2f",c);
	}

}
