class getsize
{
public static void main(String args[])
{
int a=4;
Integer temp=Integer.valueOf(a);
String x=temp.getClass().getSimpleName();
if (x.equals("Integer"))
System.out.println("4");
}
}