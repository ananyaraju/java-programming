import java.io.*;
public class BIS {
    public static void main(String[] args)
    {
  try
{
        FileInputStream inputStream
            = new FileInputStream(
                "filename.txt");

        BufferedInputStream buffInputStr
            = new BufferedInputStream(
                inputStream);
  
        // Read and print characters one by one
        System.out.println(            "Char : "            + (char)buffInputStr.read());
        System.out.println(            "Char : "            + (char)buffInputStr.read());
        System.out.println(            "Char : "            + (char)buffInputStr.read());

buffInputStr.mark(1);
System.out.println(            "Char : "            + (char)buffInputStr.read());

buffInputStr.reset();
        System.out.println(            "Char : "            + (char)buffInputStr.read());
        System.out.println(            "Char : "            + (char)buffInputStr.read());
        System.out.println(            "Char : "            + (char)buffInputStr.read());
        buffInputStr.close();
}
catch(Exception e)
{
System.out.println(e);
}

}
}