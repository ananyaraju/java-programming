import java.util.*;
class student
{
	String name; double gpa;
	student(String name, double gpa)
	{
		this.name=name;
		this.gpa=gpa;
	}
	String getinfo()
	{
		return "name: "+name+" gpa: "+gpa;
	}
}

class generics1
{
	public static void main(String args[])
	{
		List<Integer> values=Arrays.asList(1,2,3);
		List<student> s=Arrays.asList(
		new student("ananya",9.6),
		new student("nishanth",8)
		);
		System.out.println(values);
		for (student x: s)
			System.out.println(x.getinfo());
	}
}