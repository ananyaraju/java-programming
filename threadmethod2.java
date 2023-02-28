class threadmethod2 implements Runnable
{
	public void run()
	{
		System.out.println("thread is running");
	}
	public static void main(String args[])
	{
		threadmethod2 tm2=new threadmethod2();
		Thread t=new Thread(tm2);
		t.start();
	}
}