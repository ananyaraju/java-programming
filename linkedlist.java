import java.util.*;

class linkedlist
{
	public static void main(String args[])
	{
		LinkedList<Integer> list=new LinkedList<Integer>();
		for (int i=0; i<5; i++)
			list.add(i);
		for (Integer x: list)
			System.out.println(x);
		Iterator<Integer> it=list.descendingIterator();
		while (it.hasNext())
			System.out.println(it.next());
	}
}