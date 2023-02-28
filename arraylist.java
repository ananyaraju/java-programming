import java.util.*;

class arraylist
{
	public static void main(String args[])
	{
		ArrayList<Integer> list=new ArrayList<Integer>(5);
		list.add(1); list.add(2); list.add(3); list.add(4); list.add(5);
		for (int i=0; i<list.size(); i++)
			System.out.println(list.get(i));
		Iterator it=list.iterator();
		while (it.hasNext())
			System.out.println(it.next());
		//Collections.sort(list,Comparator.reverseOrder());
		//System.out.println(list);
		ListIterator<Integer> l1=list.listIterator(list.size());
		while(l1.hasPrevious())
		{
			int temp=l1.previous();
			System.out.println(temp);
		}
	}
}