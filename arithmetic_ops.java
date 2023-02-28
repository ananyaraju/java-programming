import java.util.*;
class divisionbyzero extends Exception
{
	divisionbyzero(String message)
	{
		super(message);
	}
}

class arithmetic_ops
{
	static double division(double a, double b) throws divisionbyzero
	{
		if (b==0)
			throw new divisionbyzero("division by 0 not possible");
		else
			return a/b;
	}
	public static void main(String args[]) throws InputMismatchException, IndexOutOfBoundsException, NumberFormatException, divisionbyzero
	{
		try
		{
			Double a=Double.parseDouble(args[0]);
			Double b=Double.parseDouble(args[1]);
			String op=args[2];
			System.out.println(op);
			if (op.equals("/"))
				System.out.println(division(a,b));
			if (op.equals("*"))
				System.out.println(a*b);
			if (op.equals("+"))
				System.out.println(a+b);
			if (op.equals("-"))
				System.out.println(a-b);
		}
		catch(divisionbyzero ex)
		{
			System.out.println(ex);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}