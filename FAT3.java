class bank
{
	int amount;
	int max=50000;
	bank(int amount)
	{
		this.amount=amount;
	}
	synchronized void withdraw(int x)
	{
		if (this.amount<x)
		{
			try
			{
				wait();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		if (this.amount>x)
		{
			amount-=x;
			System.out.println("withdraw completed "+amount);
			notifyAll();
		}
		else
		{
			try
			{
				wait();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
	synchronized void deposit(int x)
	{
		if (this.amount+x>max)
		{
			try
			{
				wait();	
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		if (this.amount<max)
		{
			amount+=x;
			System.out.println("deposit done "+amount);
			notifyAll();
		}
		else
		{
			try
			{
				wait();
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
		}
	}
}

class FAT3
{
	public static void main(String args[])
	{
		bank b=new bank(30000);
		Thread t1=new Thread("t1")
		{
			public void run()
			{
				b.deposit(30000);
			}
		};
		Thread t2=new Thread("t2")
		{
			public void run()
			{
				b.withdraw(20000);
			}
		};
		Thread t3=new Thread("t3")
		{
			public void run()
			{
				b.withdraw(30000);
			}
		};
		t1.start(); t2.start(); t3.start();
	}
}

