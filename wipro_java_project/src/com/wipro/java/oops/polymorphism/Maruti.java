/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/** parent class= Car
 *  Child Class = Maruti
 *  keyword - extend
 */
public class Maruti extends Car{
	
	public static void main(String a[]) {
		
		//To achieve Polymorphism here we used two method with same name but different parameters
		Car obj= new Maruti(); // Creating object reference to access the class 
		obj.mileageCalculation(14); //calling the method by passing single argument with integer data type
		obj.mileageCalculation(100,1.3f);//calling method with two arguments
	}
	
}
