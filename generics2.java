class log
{
	String message;
	log(String message)
	{
		this.message=message;
	}
	String getMessage()
	{
		return message;
	}
}

class genericlog<X>
{
	X message;
	genericlog(X message)
	{
		this.message=message;
	}
	X getMessage()
	{
		return message;
	}
}

class generics2
{
	public static void main(String args[])
	{
		log l1=new log("first message");
		System.out.println(l1.getMessage());
		genericlog<String> l2=new genericlog<String>("hi");
		System.out.println(l2.getMessage());
		genericlog<Double> l3=new genericlog<Double>(100.8);
		System.out.println(l3.getMessage());
	}
}