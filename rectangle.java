class rectangle
{
	int l, b;
	rectangle(int l, int b)
	{
		this.l=l;
		this.b=b;
	}
	int area()
	{
		return l*b;
	}
	public static void main(String args[])
	{
		rectangle r=new rectangle(2,3);
		System.out.println(r.area());
	}
}