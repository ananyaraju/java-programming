class threadmethod5
{
	static void output()
	{
		System.out.println(Thread.currentThread().getName() + " is running");
	}
	public static void main(String args[])
	{
		threadmethod5 tm5 = new threadmethod5();
		Thread t = new Thread(new Runnable()
		{
			public void run()
			{
				output();
			}
		}, "threadname");
		t.start();
	}
}