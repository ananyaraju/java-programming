import java.io.*;
class filewriter2
{
	public static void main(String args[])
	{
		try (FileWriter fw=new FileWriter("marks.txt",true);
			BufferedWriter bw=new BufferedWriter(fw))
		{
			String str="append string";
			bw.write(str);
			bw.write("\n");
			System.out.println("file editted successfully");
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}