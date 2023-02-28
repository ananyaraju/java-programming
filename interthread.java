class interthread extends Thread
{
	static int ticketcount=2;
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
		interthread t=new interthread();
		for (int i=1; i<5; i++)
		{
			new Thread(t, "thread "+i).start();
		}
	}
}