import java.util.*;
class demo
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int rem,sum, temp;
		System.out.println("Armstrong numbers from 1 to "+n+":");
		for (int i=1; i<=n; i++)
		{
			temp=i;
			sum=0;
			while (temp!=0)
			{
				rem=temp%10;
				sum=sum+(rem*rem*rem);
				temp=temp/10;
			}
			if (sum==i)
				System.out.print(i+" ");
		}
		s.close();
	}
}