class book
{
	String title, author;
	book(String title, String author)
	{
		this.title=title;
		this.author=author;
	}
	void getbook()
	{
		System.out.println(title+" "+author);
	}
}

class child extends book
{
	int a;
	child(String title, String author, int a)
	{
		super(title,author);
		this.a=a;
	}
	void getchild()
	{
		System.out.println(title+" "+author+" "+a);
	}
}

class mainclass
{
	public static void main(String args[])
	{
		child c1=new child("paper towns","john green",10);
		c1.getchild();
	}
}
