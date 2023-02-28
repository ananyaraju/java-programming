class matching extends Thread
{
	int wordcount;
	String paragraph;
	String text;
	Thread t;
	matching(String paragraph, String text, String threadname)
	{
		this.paragraph=paragraph;
		this.text=text;
		t = new Thread(this,threadname);
		t.start();
		System.out.println(t.getName()+" is starting");
	}
	void compare()
	{
		String words[]=paragraph.split(" ");
		int count=0;
		for (int i=0; i<words.length; i++)
			if (text.equals(words[i]))
				count++;
		System.out.println(Thread.currentThread().getName()+" "+count);
		this.wordcount=count;
	}
	int getwordcount()
	{
		return wordcount;
	}
	public void run()
	{
		compare();
	}
}

class textmatching
{
	public static void main(String args[])
	{
		String p1="java beans is something related to java";
		String p2="java is a programming language";
		String text="java";
		matching t1=new matching(p1,text,"thread 1");
		matching t2=new matching(p2,text,"thread 2");
		if (t1.getwordcount() > t2.getwordcount())
			System.out.println("p1 has more matches");
		else
			System.out.println("p2 has more matches");
	}
}

