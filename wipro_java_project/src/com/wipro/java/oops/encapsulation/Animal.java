/**
 * 
 */
package com.wipro.java.oops.encapsulation;

/**
 * 
 */
public class Animal {
	
	private String name;
	private String color;
	private int speed;
	
	public Animal(String name, String color, int speed) {
		super(); // accessing the objects of parent class
		this.name = name;
		this.color = color;
		this.speed = speed;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed>0) {
			this.speed = speed;
		}
		else
			System.out.println("Enter Positive Values");	
	}
	
	
	public static void main(String args[]) {
		Animal animal = new Animal("Cheeta","Yellow and Black",90);
		System.out.println("Animal Name:"+animal.getName());
		System.out.println("Color:"+animal.getColor());
		System.out.println("Running Speed:"+animal.getSpeed());
		
		animal.setSpeed(0);
		animal.setSpeed(88);//to set the new data
		System.out.println("Animal Name:"+animal.getName());
		System.out.println("Color:"+animal.getColor());
		System.out.println("Running Speed:"+animal.getSpeed());
	}
	

}
