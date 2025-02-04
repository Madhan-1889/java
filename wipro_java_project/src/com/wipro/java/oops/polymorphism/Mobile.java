/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 *  Polymorphism - One having many forms
 *  Method Overloading and Overriding can be achieve using Polymorphism
 */
public class Mobile {
	
	//Here more than one method having same name but receiving different parameters
	//It is also we call method overloading
	public void specification(int price) {
		if(price>0)
		    System.out.println("Mobile Price:"+price);
		else
			System.out.println("Enter Valid price");
	}
	
	public void specification(int ram,int storage) {
		if(ram>3) {
			if(storage>127) {
				System.out.println("Mobile Ram:"+ram+"gb Storage:"+storage+"gb");
			}
			else
				System.out.println("Enter Valid Storage");
		}
		else {
			System.out.println("Enter Valid Ram");
		}
		
	}
	
	public void specification(String name,int price) {
		if(price>0)
		    System.out.println("Mobile Brand:"+name+" Price:"+price+" From Mobile Class");
		else
			System.out.println("Enter Valid price");
	}

}

