import java.io.*;
  
public class fileoutputstream {
    public static void main(String args[]) throws Exception
    {  
      
try{      File f = new File("filename.txt");
             FileOutputStream fout=new FileOutputStream("filename.txt",true);  
             System.out.println(f);  
byte a=123;
fout.write(a);
byte b[]={123,124,125,110};
fout.write(b);
String s="This is string";
byte b1[]=s.getBytes();
fout.write(b1);
fout.close();   
      }
catch(Exception e)
{
System.out.println(e);
}    

}
}
