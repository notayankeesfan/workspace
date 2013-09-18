
public class MixedNumber 
{
	private int wholeNumber;
	private int numerator;
	private int denominator;
	
	// Ctor
	public MixedNumber (int whole, int num, int denom)
	{
		wholeNumber = whole;
		numerator = num / Fraction.greatestCommonFactor(num, denom);
		denominator = denom / Fraction.greatestCommonFactor(num, denom);
	}
	
	// Ctor
	public MixedNumber (int num, int denom)
	{
		wholeNumber = 0;
		while (num >= denom)
		{
			num = num - denom;
			wholeNumber = wholeNumber +1;
		}
		numerator = num / Fraction.greatestCommonFactor(num, denom);
		denominator = denom / Fraction.greatestCommonFactor(num, denom);
	}
	
	// Ctor
	public MixedNumber (int whole)
	{
		wholeNumber = whole;
		numerator = 0;
		denominator = 1;
	}
	
	// Ctor
	public MixedNumber (Fraction frac)
	{
		wholeNumber = 0;
		numerator = frac.getNum();
		denominator = frac.getDenom();
		while (numerator > denominator)
		{
			numerator = numerator - denominator;
			wholeNumber = wholeNumber + 1;
		}
	}
	
	// ToString
	public String toString()
	{
		if (denominator == 1)
		{
			return "" + (numerator + wholeNumber);
		}
		if (wholeNumber == 0)
		{
			return numerator + "/" + denominator;
		}
		if (numerator == 0)
		{
			return "" + wholeNumber;
		}
		if (denominator == 0)
		{
			return "undefined";
		}
		else
		{
			return wholeNumber + " " + numerator + "/" + denominator;
		}
	}
}
