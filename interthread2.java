class interthread2 extends Thread
{
	String name; Thread t;
	static int ticketcount=2;
	interthread2(String name)
	{
		this.name=name;
		t=new Thread(this, this.name);
		t.start();
	}
	synchronized void booking(String name)
	{
		if (ticketcount>0)
		{
			ticketcount--;
			System.out.println("ticket booked for "+name);
		}
		else
			System.out.println("ticket not available for "+name);
	}
	public void run()
	{
		booking(Thread.currentThread().getName());
	}
	public static void main(String args[])
	{
		for (int i=1; i<5; i++)
		{
			new interthread2("thread "+i);
		}
	}
}