import java.util.*;
class Explicit_Exception
{
static void Test_Length(String S)
{
if(S.length()<2)
throw new NullPointerException("String can't have single length");
}
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
Explicit_Exception o=new Explicit_Exception();
System.out.println(o);
String str=s.next();
try
{
Test_Length(str);
}
catch(NullPointerException e) //child of Exception class-->Specific exception
{
System.out.println(e);
}
s.close();
}
}