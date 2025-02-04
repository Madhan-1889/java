/**
 * 
 */
package com.wipro.java.interfaces;

/**
 * implementing the Animal interface in Cat class
 */

public class Cat implements Animal{
	//interface method gets implemented here
	public void skill() {
		System.out.println("Cat can climb on the walls");
	}
	
	public static void main(String args[]) {
		
		Cat cat= new Cat();
		cat.skill();
	}

}
