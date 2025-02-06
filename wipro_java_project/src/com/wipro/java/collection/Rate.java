/**
 * 
 */
package com.wipro.java.collection;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 
 */
public class Rate implements Comparator<Movie1>{
	public int compare(Movie1 m1,Movie1 m2) {
		return Double.compare(m2.getR(),m1.getR());
	}

	public static void main(String[] args) {
		ArrayList<Movie1> m1= new ArrayList<>();
		m1.add(new Movie1("Vikram",8.7,2022));
		m1.add(new Movie1("Robot",8.9,2010));
		m1.add(new Movie1("RRR",8.6,2021));
		
		Collections.sort(m1,new Rate());
		System.out.println("\nMovies sorted by Rating:");
		for(Movie1 m:m1) {
			System.out.println("Movie Name:"+m.getN()+" Rating:"+m.getR()+" Year:"+m.getY());
		}
	}

}
