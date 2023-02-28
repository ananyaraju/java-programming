class book
{
	String title, author;
	book(String title, String author)
	{
		this.title=title;
		this.author=author;
	}
	void getinfo()
	{
		System.out.println("parentclass");
		System.out.println(title);
		System.out.println(author);
	}
}

class issued extends book
{
	String name;
	issued(String title, String author, String name)
	{
		super(title, author);
		this.name=name;
	}
	void getinfo()
	{
		super.getinfo();
		System.out.println("child class");
		System.out.println(name);
	}
}

class singleinheritance
{
	public static void main(String args[])
	{
		issued obj=new issued("paper towns","john green","ananya");
		obj.getinfo();
	}
}