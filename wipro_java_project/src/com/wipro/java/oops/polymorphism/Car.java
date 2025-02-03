/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 *  Polymorphism
 */
public class Car {
	
	//This method gets run when one Argument with Integer data type is passed 
	public void mileageCalculation(int mileage) {
		System.out.println("Mileage of the car is "+mileage);
		
	}
	
	//This method gets run when two Argument with relative data type is passed 
	public void mileageCalculation(float distance,float fuel) {
		float c=distance/fuel;
		System.out.printf("Mileage of the car is %.2f",c);
	}

}
