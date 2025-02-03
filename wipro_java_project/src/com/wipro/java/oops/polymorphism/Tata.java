/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**parent class= Car
 *  Child Class = Tata
 *  keyword - extends
 */
public class Tata extends Car{
	
	public static void main(String a[]) {
		
		//To achieve Polymorphism here we used two method with same name but different parameters
		Car obj= new Tata(); // Creating object reference to access the class 
		obj.mileageCalculation(50,1.2f);//calling a method by passing two argument with related data type
		obj.mileageCalculation(15); //calling a method by passing argument with integer data type
	}

}
