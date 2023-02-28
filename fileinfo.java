import java.io.*;
class fileinfo
{
	public static void main(String args[])
	{
		File f=new File("marks.txt");
		if (f.exists())
		{
			System.out.println("file name is "+f.getName());
			System.out.println("file path is "+f.getAbsolutePath());
			System.out.println("readable: "+f.canRead());
			System.out.println("writeable: "+f.canWrite());
			System.out.println("file size is "+f.length());
		}
		else
		{
			System.out.println("file doesnt exist");
		}
	}
}