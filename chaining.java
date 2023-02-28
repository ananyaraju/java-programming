class student
{
	String name;
	int marks[];
	student(String name, int marks[])
	{
		this.name=name;
		this.marks=marks;
	}
	int getaverage()
	{
		System.out.println("name: "+name);
		int sum=0, avg;
		for (int i=0; i<marks.length; i++)
			sum+=marks[i];
		avg=sum/marks.length;
		return avg;
	}
}

class chaining
{
	public static void main(String args[])
	{
		student s=new student("ananya",new int[]{10,9,8});
		System.out.println(s.getaverage());
	}
}