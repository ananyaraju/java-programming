class multithread implements Runnable
{
	String threadname;
	Thread t;
	multithread (String threadname)
	{
		this.threadname=threadname;
		t=new Thread(this,threadname);
		System.out.println(t.getName()+" has been initialised");
		t.start();
		System.out.println(t.getName()+" has started");
	}
	long factorial(int n)
	{
		long f=1;
		for (int i=1; i<=n; i++)
			f=f*i;
		return f;
	}
	public void run()
	{
		System.out.println(factorial(6));
	}
	public static void main(String args[])
	{
		multithread mt=new multithread("thread 1");
		System.out.println(mt.factorial(4));
	}
}