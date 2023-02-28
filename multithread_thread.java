class multithread_thread extends Thread
{
	String name; Thread t;
	multithread_thread(String name)
	{
		this.name=name;
		t=new Thread(this, name);
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
		System.out.println(factorial(4));
	}
	public static void main(String args[])
	{
		new multithread_thread("thread 1");
		new multithread_thread("thread 2");
		new multithread_thread("thread 3");
	}
}