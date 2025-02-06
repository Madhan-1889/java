/**
 * 
 */
package com.wipro.java.collection;

import java.util.Comparator;

/**
 * 
 */
public class NameCompare implements Comparator<Movie1>{
	public int compare(Movie1 m1,Movie1 m2) {
		return m1.getN().compareTo(m2.getN());
	}

}
