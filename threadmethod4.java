class threadmethod4 implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" is running");
	}
	public static void main(String args[])
	{
		Runnable tm4 = new threadmethod4();
		Thread t=new Thread(tm4, "thread 1");
		t.start();
	}
}