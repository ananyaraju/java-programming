class stringf
{
public static void main(String args[])
{
String s="Java programming";
String t="Java programming";
String s1=new String("Java programming");
String s2=new String("Java programming");
System.out.println(s1.concat(s));
System.out.println(s2.concat(s1));
System.out.println(s.concat(t));
}
}