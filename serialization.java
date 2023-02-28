import java.io.*;

class employee
{
	String name; int salary;
	employee(String name, int salary)	
	{
		this.name=name;
		this.salary=salary;
	}
}

class serialization
{
	public static void main(String args[])
	{
		employee e=new employee("ananya",10000);
		try
		{
			FileOutputStream fos=new FileOutputStream("demo.txt");
			ObjectOutputStream o=new ObjectOutputStream(fos);
			o.writeObject(e);
			o.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}
