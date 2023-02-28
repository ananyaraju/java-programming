import java.util.Scanner;
class asc_order
{
	public static void main(String args[])
	{
		int a[]=new int[10];
		int temp;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int count=obj.nextInt();
		System.out.println("Enter elements of array: ");
		for (int i=0; i<count; i++)
			a[i]=obj.nextInt();
		for (int i=0; i<count; i++)
		{
			for (int j=i+1; j<count; j++)
			{
				if (a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Ascending Order:");
		for (int i=0; i<count; i++)
			System.out.println(a[i]);
		obj.close();
	}
}


