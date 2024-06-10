package com.Adrian;

/**
 * @author Adrian Cieplicki
 * date 02/27/2024
 * Creating a point class
 */

public class Point {
	/**
	 * The coordinates of the point
	 */
	private double x, y;
	
	/**
	 * The Default constructor
	 */
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
	/**
	 * Constructor with coordinates passed in
	 * @param x The x-coordinate of the point
	 * @param y The y-coordinate of the point
	 */
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Getter for the x-coordinate of this point
	 * @return The x-coordinate of this point
	 */
	public double getX() {
		return this.x;
	}
	
	/**
	 * Getter for the y-coordinate of this point
	 * @return The y-coordinate of this point
	 */
	public double getY() {
		return this.y;
	}
	
	/**
	 * Gets the distance between two points
	 * @param o The other point to find the distance to from this point
	 * @return The distance between the points
	 */
	public double dist(Point o) {
		double x2 = o.x - this.x;
		double y2 = o.y - this.y;
		return Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));
	}
	
	/**
	 * Gets the midpoint between two points
	 * @param o The other point to calculate the midpoint from this point
	 * @return The midpoint between the two points
	 */
	public Point midpoint(Point o) {
		double x2 = (o.x + this.x) / 2;
		double y2 = (o.y + this.y) / 2;
		Point point = new Point(x2, y2);
		return point;
	}
}
