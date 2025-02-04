/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 * 
 */
public class Customer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Here we are passing arguments for methods with same name  
		Mobile obj = new Mobile();//creating class object for Mobile class
		obj.specification(25000);
		obj.specification(8, 128);
		obj.specification("Moto", 20000);
		obj.specification(3, 128);
		obj.specification(4, 127);
		
		MobileBranch obj1 = new MobileBranch();//creating class object for MobileBranch class
		obj1.specification("Redmi", 23000);

	}

}
