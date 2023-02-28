import java.util.*;

class diagonal
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("rows/columns how many");
		int r=s.nextInt(); int c=s.nextInt();
		int a[][]=new int[r][c];
		System.out.println("enter elements");
		for (int i=0; i<r; i++)
			for (int j=0; j<c; j++)
				a[i][j]=s.nextInt();
		int sum=0;
		for (int i=0; i<r; i++)
			for (int j=0; j<c; j++)
				if (i==j)
					sum+=a[i][j];
		System.out.println("sum: "+sum);
		if (sum%2==0)
		{
			for (int i=0; i<r; i++)
				for (int j=0; j<c; j++)
					if (a[i][j]%2==0)
						System.out.println(a[i][j]);
		}
		else
		{
			for (int i=0; i<r; i++)
				for (int j=0; j<c; j++)
					if (a[i][j]%2!=0)
						System.out.println(a[i][j]);
		}
		s.close();
	}
}