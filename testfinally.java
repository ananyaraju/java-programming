class testfinally
{
	static void test() throws IllegalArgumentException
	{
		System.out.println("test executed");
		throw new ArrayStoreException();
	}
	public static void main(String[] args)
	{
		int c=0;
		try
		{
			int a=5/5;
			System.out.println(a+" "+c);
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();
		}
		finally
		{
			System.out.println("finally executed");
		}
	test();
	}
}