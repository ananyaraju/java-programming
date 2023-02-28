class threadmethod1 extends Thread
{
	public void run()
	{
		System.out.println("thread is running");
	}
	public static void main(String args[])
	{
		threadmethod1 t=new threadmethod1();
		t.start();
	}
}