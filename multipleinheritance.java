class multipleinheritance
{
	public static void main(String args[])
	{
		manager m=new manager("ananya",10000,"mumbai");
		m.getinfo();
	}
}

class person
{
	String name;
	person(String name)
	{
		this.name=name;
	}
	void getinfo()
	{
		System.out.println("person name is "+name);
	}
}

class employee extends person
{
	int salary;
	employee(String name, int salary)
	{
		super(name);
		this.salary=salary;
	}
	void getinfo()
	{
		super.getinfo();
		System.out.println("employee salary is "+salary);
	}
}

class manager extends employee
{
	String mgr;
	manager(String name, int salary, String mgr)
	{
		super(name, salary);
		this.mgr=mgr;
	}
	void getinfo()
	{
		super.getinfo();
		System.out.println("city he manages is "+mgr);
	}
}
