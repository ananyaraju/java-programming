import java.io.*;
  
public class fileinputstream {
    public static void main(String args[]) throws Exception
    {  
      File f = new File("filename.txt");
      System.out.println(f);
FileInputStream fis=new FileInputStream("filename.txt");
System.out.println("available is : "+ fis.available());
// int ch;
/*while ((ch=fis.read())!=-1) 
{
            System.out.print((char)ch); 
}*/
System.out.println(fis.read());
byte b[]=new byte[20];
fis.read(b);
for(byte B:b)
System.out.print((char)B);
System.out.println();
fis.read(b,5,10);
for(byte B:b)
System.out.print((char)B);
fis.close();
}
}






