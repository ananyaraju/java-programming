import java.io.*;
class filereader1
{
	public static void main(String args[])
	{
		try
		{
			FileInputStream fis=new FileInputStream("marks.txt");
			int ch;
			while((ch=fis.read()) != -1)
				System.out.print((char)ch);
			fis.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}