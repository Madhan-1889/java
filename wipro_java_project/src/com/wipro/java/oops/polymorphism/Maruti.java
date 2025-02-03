/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 * 
 */
public class Maruti extends Car{
	
	public static void main(String a[]) {
		Car obj= new Maruti();
		obj.mileageCalculation(14);
		obj.mileageCalculation(100,1.3f);
	}
	
}
