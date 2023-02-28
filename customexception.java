class negativenumberexception extends Exception
{
	negativenumberexception(String message)
	{
		super(message);
	}
}
class positiveexception extends Exception {
	positiveexception(String message) {
		super(message);
	}
}

class customexception
{
	static void demo(int x) throws positiveexception {
		if (x>0) {
			throw new positiveexception("lol wtf is this");
		}
		else {
			System.out.println("harsh gujral");
		}
	}
	static void getexception(int x) throws negativenumberexception
	{
		if (x<0)
			throw new negativenumberexception("negative number");
		else
			System.out.println("positive number");
	}
	public static void main(String args[])
	{
		try
		{
			getexception(3-5);
			demo(2);
		}
		catch(negativenumberexception e)
		{
			System.out.println(e);
		}
		catch(positiveexception e) {
			System.out.println(e);
		}
	}
}

