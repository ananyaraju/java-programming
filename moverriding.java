class moverriding1
{
	int getcredits()
	{
		return 90;
	}
}

class moverriding2 extends moverriding1
{
	int getcredits()
	{
		return 160;
	}
}

class moverriding
{
	public static void main(String args[])
	{
		moverriding1 m1=new moverriding1();
		moverriding2 m2=new moverriding2();
		System.out.println(m1.getcredits());
		System.out.println(m2.getcredits());
	}
}

