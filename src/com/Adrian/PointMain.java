package com.Adrian;

/**
 * @author Adrian Cieplicki
 * date 06/06/2024
 * A java implementation of Hello World
 */

public class PointMain {

	/**
	 * Main Method
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		// Create new points
		Point point = new Point(2,7);
		Point point2 = new Point(4, 5);
		Point midpoint = point.midpoint(point2);
		
		// Output of operations with the points
		System.out.println("Midpoint: " + midpoint.getX() + ", " + midpoint.getY());
		
		System.out.println("Distance: " + point.dist(point2));

	}

}
