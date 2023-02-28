import java.util.*;

class hashmap
{
	public static void main(String args[])
	{
		Map<Integer,String> map=new HashMap<Integer, String>();
		map.put(1,"ananya");
		map.put(2,"nishanth");
		map.put(3,"rishita");
		System.out.println(map.toString());
		for (Map.Entry<Integer,String> x: map.entrySet())
		{
			System.out.println(x.getKey()+" "+x.getValue());
		}
		Map<String, List<Integer>> marks = new HashMap<String, List<Integer>>();
		marks.put("ananya",Arrays.asList(34,35,36,34));
		System.out.println(marks);
	}
}