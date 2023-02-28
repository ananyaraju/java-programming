import java.util.*;
class inlab extends Thread
{
	public void prime(int n)
	{
		System.out.println();
		int count;
		System.out.println("Prime numbers from 1 to "+n+":");
		for (int num=2; num<=n; num++)
		{
			count=0;
			for (int i=2; i<=num/2; i++)
			{	
				if (num%i==0)
				{
					count++;
					break;
				}
			}
			if (count==0 &&num!=1)
				System.out.print(num+" ");
		}
		System.out.println();
	}
	public void even(int n)
	{
		System.out.println();
		System.out.println("Even numbers from 1 to "+n+":");
		for (int i=0; i<=n; i++)
		if (i%2==0)
			System.out.print(i+" ");
		System.out.println();
	}
	public void armstrong(int n)
	{
		System.out.println();
		System.out.println("Armstrong numbers from 1 to "+n+":");
		int temp, ans, r;
		for (int i=1; i<=n; i++)
		{
			temp=i;
			ans=0;
			while (temp!=0)
			{
				r=temp%10;
				ans=ans+(r*r*r);
				temp=temp/10;
			}
			if (ans==i)
				System.out.print(i+" ");
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter n: ");
		int n=s.nextInt();
		inlab t=new inlab();
		Thread t1=new Thread(new Runnable()
		{
			public void run()
			{
				t.prime(n);
			}
		});
		Thread t2=new Thread(new Runnable()
		{
			public void run()
			{
				t.even(n);
			}
		});
		Thread t3=new Thread(new Runnable()
		{
			public void run()
			{
				t.armstrong(n);
			}
		});
		t1.start();
		t2.start();
		t3.start();
		try
		{
			t1.join(); t2.join(); t3.join(); 
			s.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}