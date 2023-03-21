class Throws_Example
{
static void Test_Length(String S)
{
System.out.println(S.length());
if(S.length()<2)
throw new NullPointerException("String can't have single length");
System.out.println(10/0);
}
public static void main(String args[])
{
String s="a";
try
{
Test_Length(s);
}
catch(NullPointerException e)
{
System.out.println(e.getMessage());
}
catch(ArithmeticException e)
{
System.out.println(e.getMessage());
}
}
}