import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
class SortStringArray_Desc
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter number of strings: ");
		int len=obj.nextInt();
		String a[]=new String[len+1];
		System.out.println("Enter elements of array: ");
		for (int i=0; i<=len; i++)
			a[i]=obj.nextLine();
		System.out.println();
		System.out.print("Original String Array: ");
		for (int i=0; i<=len; i++)
			System.out.println(a[i]);
		System.out.println();
		Arrays.sort(a,Collections.reverseOrder());
		System.out.print("String Array in Descending Order: ");
		System.out.println();
		for (int i=0; i<=len; i++)
			System.out.println(a[i]);
		obj.close();
	}
}
