/*
 * LinearEquation.java: A class that to create
 * linear equations in the form of y=mx+b. Linear
 * equations can be created based on their slope
 * and y-intercept or based on two points on the
 * line. These equations will be printed in slope-
 * intercept form (via the toString() method).
 * 
 * Utility methods include finding a y-value given
 * an x-value, finding an x-value given a y-value,
 * finding the inverse of the equation, and finding
 * the composition of two linear equations.
 * 
 * Written by Mr. Marshall
 * Period 5
 * 9/13/2013
 * VERSION 3
 */

public class LinearEquation {

	private double slope;
	private double yInt;
	
	// default ctor
	public LinearEquation(){
		slope = 1;
		yInt = 0;
	}
	
	/*
	 * Constructor to create a LinearEquation object
	 * based on the slope and y-intercept.
	 * Parameters:	m = the slope
	 * 				b = the y-intercept
	 */
	public LinearEquation(double m, double b){
		slope = m;
		yInt = b;
	}
	
	/*
	 * Constructor base on 2 ordered pairs (x1,y1) and (x2,y2)
	 * Parameters: x1, y1, x2, y2 = the 4 coordinates
	 */
	public LinearEquation(double x1, double y1, double x2, double y2){
		slope = (y2 - y1) / (x2 - x1);
		yInt = y1 - slope * x1;
	}
	
	/*
	 * Creates a String representation of the LinearEquation object
	 * Parameters: none
	 * Returns: the String version of the object
	 */
	public String toString(){
		return "y = " + slope + "x + " + yInt;
	}

	/*
	 * Finds a y-value given an x-value
	 * Parameters:	x = the x-value
	 * Returns: the y-value
	 */
	public double getY(double x){
		double y = slope * x + yInt;
		return y;
	}
	
	/*
	 * Finds an x-value given a y-value
	 * Parameters: y = the value
	 * Returns: the x-value
	 */
	public double getX(double y){
		return (y - yInt) / slope;
	}
	
	/*
	 * Calculates and returns the inverse of this
	 * LinearEquation object.
	 * Parameters: none
	 * Returns: the inverse of this object as a LinearEquation
	 */
	public LinearEquation inverse(){
		double newSlope = 1 / slope;
		double newYInt = -yInt / slope;
		return new LinearEquation(newSlope, newYInt);
	}
	
	public LinearEquation compose(LinearEquation inner){
		double newSlope = this.slope * inner.getSlope();
		double newYInt = this.slope * inner.getyInt() + this.yInt;
		return new LinearEquation(newSlope, newYInt);
	}
	
	/*
	 * Returns the value of the slope
	 */
	public double getSlope() {
		return slope;
	}

	/*
	 * Modifies the value of the slope
	 */
	public void setSlope(double slope) {
		this.slope = slope;
	}

	/*
	 * Returns the value of the y-intercept
	 */
	public double getyInt() {
		return yInt;
	}

	/*
	 * Modifies the value of the y-intercept
	 */
	public void setyInt(double yInt) {
		this.yInt = yInt;
	}
}








