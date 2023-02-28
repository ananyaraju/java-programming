import java.io.*;
class DataOut_In_putStreamDemo
{
    public static void main(String args[]) throws IOException
    {
               try ( DataOutputStream dout =
                    new DataOutputStream(new FileOutputStream("Data.txt")) )
        {
           dout.writeInt(10);
  dout.writeLong(10000000000l);
  dout.writeDouble(0.1);
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("Cannot Open the Output File");
            return;
        }
          
        try ( DataInputStream din =
                    new DataInputStream(new FileInputStream("Data.txt")) )
        {       
System.out.println(din.readDouble());
System.out.println(din.readInt());
System.out.println(din.readLong());

        }
        catch(FileNotFoundException e)
        {
            System.out.println("Cannot Open the Input File");

        }
    }
}