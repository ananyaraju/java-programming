import java.util.*;
class example
{
public static void main(String args[])
{
String a, b, c;
Scanner s=new Scanner(System.in);
System.out.println("enter 1: ");
a=s.next();
System.out.println("entered 1");
System.out.println("enter 2: ");
b=s.nextLine();
System.out.println("entered 2");
System.out.println("enter 3: ");
c=s.nextLine();
System.out.println("entered 3");
System.out.println(a);
System.out.println(b);
System.out.println(c);
s.close();
}
}