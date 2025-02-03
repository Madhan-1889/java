/**
 * 
 */
package com.wipro.java.oops;

/**
 * POJO - Plain Old Java Object
 */
public class Animal {

	/**No Constructor
	 * Getter Has return value
	 * Setter has no return value
	 * properties that determine private field
	 * values are behaviors are determine through setters
	 * toString will covert the entire Animal class with properties and behaviors
	 */
	
	//Private Properties = structures
	private String name; // Name of the animal
	private String type; // Animal Type
	private String color; // Animal color
	private float weight; // Weight of the animal
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = "Tiger";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = "Land Type";
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = "Orange with Black";
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = 250f;
	}
	
	public String toString() {
		return "name:"+name+" Type:"+type+" Color:"+color+" Weight:"+weight;
	}
	
	
}
