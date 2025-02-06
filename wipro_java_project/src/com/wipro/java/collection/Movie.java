/**
 * 
 */
package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 */
public class Movie implements Comparable<Movie> {
	private String n; //Movie name
	private double r; //Movie rating
	private int y; //Movie year
	
	public Movie(String n,double r, int y) {
		this.n=n;
		this.r=r;
		this.y=y;
	}
	
	public int compareTo(Movie m) {
		return Double.compare(m.r,this.r);
	}
	
	public String getName() {
		return n;
	}

	public double getRating() {
		return r;
	}

	public int getYear() {
		return y;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Movie> movie= new ArrayList<>();
		movie.add(new Movie("Leo",8.2,2023));
		movie.add(new Movie("GOAT",7.9,2024));
		movie.add(new Movie("Retro",8.4,2024));
		
		System.out.println("Before sorting:");
		for(Movie m:movie) {
			System.out.println("Movie Name:"+m.getName()+" Rating:"+m.getRating()+" Year:"+m.getYear());
		}
		
		//sorting the data
		Collections.sort(movie);
		
		System.out.println("\nAfter sorting:");
		for(Movie m:movie) {
			System.out.println("Movie Name:"+m.getName()+" Rating:"+m.getRating()+" Year:"+m.getYear());
		}
		

	}

}
