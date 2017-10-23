package exe3;
public class Main
{
	public static void main(String[] args)
	{
		if(args.length != 1)
		{
			System.out.println("user input has a wrong length");
			System.exit(1);
		}
		int number = 0;
		try 
		{
			number = Integer.parseInt(args[0]);
		} 
		catch (NumberFormatException e) 
		{
			System.out.println("user input has a wrong format");
			System.exit(1);
		}
		if(number < 0)
		{
			System.out.println("User input is negative value");
			System.exit(1);
		}
		System.out.println("Tri(" + number + ") = " + tri(number));
		System.out.println("Lazy(" + number + ") = " + lazy(number));
	
	}
	public static int tri(int number)
	{
		return number * ( number + 1) / 2;
	}
	public static int lazy(int number)
	{
		return ( number * number + number + 2 ) / 2;
	}
}
