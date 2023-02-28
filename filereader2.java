import java.io.*;
class filereader2
{
	public static void main(String args[])
	{
		try
		{
			FileReader fr=new FileReader("marks.txt");
			BufferedReader br=new BufferedReader(fr);
			String line="";
			while ((line=br.readLine())!=null)
			{
				System.out.println(line);
			}
			br.close();
		}
		catch (IOException e)
		{
			System.out.println(e);
		}
	}
}