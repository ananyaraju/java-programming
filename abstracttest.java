abstract class shape
{
	abstract int area();
	abstract int perimeter();
}

class square extends shape
{
	int side;
	square(int side)
	{
		this.side=side;
	}
	int area()
	{
		return side*side;
	}
	int perimeter()
	{
		return 4*side;
	}
}

class rectangle extends shape
{
	int l, b;
	rectangle(int l, int b)
	{
		this.l=l; this.b=b;
	}
	int area()
	{
		return l*b;
	}
	int perimeter()
	{
		return 2*(l+b);
	}
}

class abstracttest
{
	public static void main(String args[])
	{
		shape s=new square(10);
		shape r=new rectangle(2,3);
		System.out.println(s.area()); System.out.println(s.perimeter());
		System.out.println(r.area()); System.out.println(r.perimeter());
	}
}