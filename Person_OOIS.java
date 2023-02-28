import java.io.*;

class Person_OOIS implements Serializable
{
String name,address;
Person_OOIS()
{
System.out.println("Parent class constructor");
}
void get(String n,String a)
{
name=n;
address=a;	
}
void show()
{
System.out.println("Name is "+name);
System.out.println("Address is "+address);
}
public static void main(String args[])
{
Person_OOIS p=new Person_OOIS();
p.get("Naveen","SJT413a21");
p.show();

try
{
FileOutputStream f=new FileOutputStream("Object_state.txt");
ObjectOutputStream oos=new ObjectOutputStream(f);
oos.writeObject(p);
oos.close();
}
catch(Exception e)
{
}
try
{
FileInputStream i=new FileInputStream("Object_state.txt");
ObjectInputStream ois=new ObjectInputStream(i);
Person_OOIS e=(Person_OOIS)ois.readObject();
System.out.println(e.name);
ois.close();
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
}
}
