/**
 * 
 */
package com.wipro.java.oops;

/**
 * 
 */
public class Flowers {
	
	String color;
	String name;
	
	public Flowers(String name,String color) {
		this.name= name;
		this.color= color;
	}
	
	public void display() {
		System.out.println(name+" is the name of a flower and it is "+color+" in colour");

	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Flowers flower1= new Flowers("Rose","red");
		Flowers flower2= new Flowers("Sunflower","yellow");
		Flowers flower3= new Flowers("Jasmine","white");
		flower1.display();
		flower2.display();
		flower3.display();

	}

}
