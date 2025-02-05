/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 * Polymorphism - One having many forms
 *  Method Overloading and Overriding can be achieve using Polymorphism
 */
public class MobileBranch extends Mobile{
	
	//Here we overriding the method of parent class having same method name and same parameters in same order
	@Override 
	public void specification(String name,int price) {
		if(price>0)
		    System.out.println("Mobile Brand:"+name+" Price:"+price+" From MobileBranch Class");
		else
			System.out.println("Enter Valid price");
	}

}
