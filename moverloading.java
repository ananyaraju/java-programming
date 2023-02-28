class moverloading1
{
	void get(String type, int credits)
	{
		System.out.println(type+" "+credits);
	}
}

class moverloading2 extends moverloading1
{
	void get(String type, int credits, String x)
	{
		System.out.println(type+" "+credits+" "+x);
	}
}

class moverloading
{
	public static void main(String args[])
	{
		moverloading1 m1=new moverloading1();
		moverloading2 m2=new moverloading2();
		m1.get("pg",90);
		m2.get("ug",160,"enrolled");
	}
}

