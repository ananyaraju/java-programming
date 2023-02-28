import java.io.*;
class filewriter1
{
	public static void main(String args[])
	{
		try (FileWriter fw=new FileWriter("marks.txt", true)) //true written to append
		{
			String str="demo string";
			fw.write(str);
			fw.write("\n");
			System.out.println("file written");
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}