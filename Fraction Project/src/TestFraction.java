
public class TestFraction 
{
	public static void main (String [] args)
	{
		// Test two int constructor
		Fraction FractionA = new Fraction(3d , 4);
		System.out.println ("FractionA is " + FractionA.toString() );
		
		//Test single integer constructor
		Fraction FractionB = new Fraction (5);
		System.out.println ("FractionB is " + FractionB.toString() );
		
		//Test add method
		Fraction FractionC = FractionA.add(FractionB);
		System.out.println (FractionA + " + " + FractionB + " = " + FractionC );
		
		//Test subtract method
		FractionC = FractionA.subtract(FractionB);
		System.out.println (FractionA + " - " + FractionB + " = " + FractionC );
		//Test multiply method
		FractionC = FractionA.multiply(FractionB);
		System.out.println (FractionA + " * " + FractionB + " = " + FractionC);
		
		//Test divide method
		FractionC = FractionA.divide(FractionB);
		System.out.println ( FractionA + " / " + FractionB + " = " + FractionC);
		
		//Test toDecimal
		double A = FractionA.toDecimal();
		System.out.println ("FractionA's decimal equivalent is " + A);
		
		//Test reciprocal
		FractionC = FractionA.reciprocal();
		System.out.println ("The Reciprocal of FractionA is " + FractionC);
		
		//Test Reducing
		Fraction FractionD = new Fraction (4, 2);
		System.out.println ("FractionD is " + FractionD);
		
		FractionD = new Fraction(2, 4);
		System.out.println ("FractionD is " + FractionD);
		
		FractionD = new Fraction (-4, 2);
		System.out.println ("FractionD is " + FractionD);
		
		FractionD = new Fraction(2, -4);
		System.out.println ("FractionD is " + FractionD);
		
		
	}
}
