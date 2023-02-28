interface kpop
{
	void leader();
	void maknae();
}

class bts implements kpop
{	
	@Override
	public void leader()
	{
		System.out.println("kim namjoon");
	}
	@Override
	public void maknae()
	{
		System.out.println("jeon jungkook");
	}
}

class exo implements kpop
{	
	@Override
	public void leader()
	{
		System.out.println("suho");
	}
	@Override
	public void maknae()
	{
		System.out.println("sehun");
	}
}

class interfacing
{
	public static void main(String args[])
	{
		kpop g1 = new bts();
		kpop g2 = new exo();
		g1.leader(); g2.leader();
		g1.maknae(); g2.maknae();
	}
}