class desc_order
{
	public static void main(String args[])
	{
		int a[]=new int[10]; int temp;
		int n=args.length;
		for (int i=0; i<n; i++)
			a[i]=Integer.parseInt(args[i]);
		for (int i=0; i<n; i++)
		{
			for (int j=i+1; j<n; j++)
			{
				if (a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Descending Order:");
		for (int i=0; i<n; i++)
			System.out.println(a[i]);
	}
}

