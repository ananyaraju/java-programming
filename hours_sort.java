import java.util.*;
class hours_sort
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int hours[][]=new int[8][7];
		int totalhours[]=new int[8];
		for (int i=0; i<8; i++)
			for (int j=0; j<7; j++)
				hours[i][j]=s.nextInt();
		int sum=0;
		for (int i=0; i<8; i++)
		{
			for (int j=0; j<7; j++)
			{
				sum+=hours[i][j];
				
			}
			totalhours[i]=sum;
			sum=0;
		}
		int temp;
		for (int i=0; i<8; i++)
		{
			for (int j=i+1; j<8; j++)
			{
				if (totalhours[i]<totalhours[j])
				{
					temp=totalhours[i];
					totalhours[i]=totalhours[j];
					totalhours[j]=temp;
				}
			}
		}
		for (int i=0; i<8; i++)
			System.out.print(totalhours[i]+" ");
		s.close();
	}
}