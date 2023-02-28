class person
{
	String name, address, email; long phone;
	String cl="person";
	person(String name, String address, long phone, String email)
	{
		this.name=name;
		this.address=address;
		this.phone=phone;
		this.email=email;
	}
	person(String name)
	{
		this.name=name;
	}
	@Override
	public String toString()
	{
		return "name: "+name+" class: "+cl;
	}
}

class student extends person
{
	final String status;
	String cl="student";
	student(String name, String status)
	{
		super(name);
		this.status=status;
	}
	@Override
	public String toString()
	{
		return "name: "+name+" class: "+cl;
	}
}

class employee extends person
{
	String office; int salary;
	String cl="employee";
	employee(String name, String office, int salary)
	{
		super(name);
		this.office=office;
		this.salary=salary;
	}
	employee(String name)
	{
		super(name);
	}
	@Override
	public String toString()
	{
		return "name: "+name+" class: "+cl;
	}	
}

class faculty extends employee
{
	int officehrs; int rank;
	String cl="faculty";
	faculty(String name, int officehrs, int rank)
	{
		super(name);
		this.officehrs=officehrs;
		this.rank=rank;
	}
	@Override
	public String toString()
	{
		return "name: "+name+" class: "+cl;
	}
}

class staff extends employee
{
	String title; String cl="staff"; 
	staff(String name, String title)
	{
		super(name);
		this.title=title;
	}
	@Override
	public String toString()
	{
		return "name: "+name+" class: "+cl;
	}
}

class FAT2
{
	public static void main(String args[])
	{
		person p=new person("ananya","mumbai",911,"an@gmail.com");
		System.out.println(p.toString());
		student s=new student("nishanth","sophomore");
		System.out.println(s.toString());
		employee e=new employee("riya","mumbai",12000);
		System.out.println(e.toString());
		faculty f=new faculty("shivam",12,3);
		System.out.println(f.toString());
		staff st=new staff("jiya","coe");
		System.out.println(st.toString());
	}
}