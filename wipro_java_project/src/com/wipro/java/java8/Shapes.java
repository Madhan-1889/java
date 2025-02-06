/**
 * 
 */
package com.wipro.java.java8;

/**
 * 
 */
//Functional Interface for Shapes
@FunctionalInterface
interface ShapeInterface {
	double area(); // Abstract method
	 
	 // Default methods
	 default String display() {
	     return "This is a shape.";
	 }
	 
	 default String showInfo() {
	     return "Shapes have area and perimeter.";
	 }
	 
	 // Static methods
	 static String commonShapeInfo() {
	     return "Shapes can be 2D or 3D.";
	 }
	 
	 static String printShapeType(String shapeType) {
	     return "The shape is: " + shapeType;
	 }
}

//Implementation of Functional Interface

class Shapes implements ShapeInterface {
    @Override
    public double area() {
        double side = 4;
        return side * side;
    }
    
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        System.out.println("Square Area: " + shape.area());
        
        // Default methods
        System.out.println(shape.display());
        System.out.println(shape.showInfo());
        
        // Static methods
        System.out.println(ShapeInterface.commonShapeInfo());
        System.out.println(ShapeInterface.printShapeType("Square"));
    }
}