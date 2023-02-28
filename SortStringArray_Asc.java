import java.util.Scanner;
class SortStringArray_Asc
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter number of strings: ");
		int length=obj.nextInt();
		String a[]=new String[length+1]; String temp;
		System.out.println("Enter elements of array: ");
		for (int i=0; i<=length; i++)
			a[i]=obj.nextLine();
		System.out.println();
		System.out.print("Original String Array: ");
		for (int i=0; i<=length; i++)
			System.out.println(a[i]);
		int counter=0; 
		for (int i=1; i<=length-1; i++)
		{
			for (int j=i+1; j<=length; j++)
			{
    				while(a[i].charAt(counter)==a[j].charAt(counter) && counter<a[i].length())
        					counter++;
    				if (a[i].charAt(counter)>a[j].charAt(counter))
    				{
        					temp=a[i];
       	 				a[i]=a[j];
        					a[j]=temp;
        					counter=0;
    				}
			}
		}
		System.out.println();
		System.out.print("String Array in Ascending Order: ");
		for (int i=0; i<=length; i++)
			System.out.println(a[i]);
		obj.close();
	}
}
