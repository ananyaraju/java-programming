import java.io.*;
  
public class filewriter {
    public static void main(String args[]) throws Exception
    {  
      File f = new File("filename.txt");
FileWriter fw=new FileWriter(f,true);  //or FileWriter fw=new FileWriter("filename.txt");
fw.write('A'); fw.write('\n'); 
fw.write(65); fw.write('\n'); 
char a[]={'A','a','b','B'};
fw.write(a);
String s="This is string values";
fw.write(s);
fw.close();
}
}