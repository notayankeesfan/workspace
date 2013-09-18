
public class StaircasePrinter
{
	public static void main(String[] args)
	{
//initial
		System.out.println ("+---+");
		System.out.println ("|   |");
		System.out.println ("+---+");
		
//Loops
		int x = 2;
		int cycle = 0;
		if (cycle < x)
		{
			System.out.print("|   |");
	
	
		while (cycle < x)
		{
			System.out.print ("   |");
			cycle ++;
		if (cycle >= x)
		{
				System.out.println("");
		}
	}	
}
	}
	
}