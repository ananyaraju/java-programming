import java.io.*;
class filereader
{
public static void main(String args[])
{
char array[]=new char[100];
try
{
FileReader fr=new FileReader("filename.txt");
fr.read(array);
System.out.println(array);
fr.close();
}
catch(Exception e)
{
e.printStackTrace();
}
}
}