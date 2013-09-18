/*
 * TestLinearEquation.java: a test driver to test all of
 * the functionalities of the LinearEquation class
 * Written by Mr. Marshall
 * Period 5
 * 9/13/2013
 */
public class TestLinearEquation {

	public static void main(String[] args) {
		// testing the (slope, yint) constructor
		LinearEquation lineA = new LinearEquation(2, -4);
		System.out.println("Line A: " + lineA.toString());
		
		// testing the (x1,y1,x2,y2) ctor
		LinearEquation lineB = new LinearEquation(3, 5, 1, 3);
		System.out.println("Line B: " + lineB);//same as lineB.toString()

		//testing getY()
		double x = 17;
		System.out.println("When x = " + x + " is plugged into " + lineA +
				" the result is " + lineA.getY(x));
		
		// testing inverse()
		LinearEquation lineC = lineA.inverse();
		System.out.println("The inverse of " + lineA + " is " + lineC);
		
		// testing compose()
		lineC = lineA.compose(lineC);
		System.out.println(lineC);
		
		lineC = new LinearEquation();
		System.out.println(lineC);
	}

}








