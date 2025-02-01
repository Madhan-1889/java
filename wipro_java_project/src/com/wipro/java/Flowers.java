/**
 * 
 */
package com.wipro.java;

/**
 * 
 */
public class Flowers {
     
	String color;
	String name;
	public Flowers(String name,String color) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.color=color;
	}
	
	public void display() {
		System.out.println(name+" is a flower and it is "+color+" in colour");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flowers flower1 = new Flowers("Rose","red");
		Flowers flower2 = new Flowers("Sunflower","yellow");
		flower1.display();
		flower2.display();

	}

}
