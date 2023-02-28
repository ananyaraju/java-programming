class ex1 extends Exception
{
	ex1(String message)
	{
		super(message);
	}
}
class mainexc
{
	static String getage(int age) throws ex1
	{
		if (age>80)
			throw new ex1("invalid");
		else 
			return("valid");
	}
	public static void main(String args[])
	{
		try
		{
			System.out.println(getage(76));
		}
		catch(ex1 e)
		{
			System.out.println("message");
		}
	}
}

	