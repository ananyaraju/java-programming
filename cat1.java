import java.util.*;
class cat1
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String[][] f=new String[2][2];
String[][] l=new String[2][2];
for (int i=0; i<2; i++)
for (int j=0; j<2; j++)
f[i][j]=s.next();
for (int i=0; i<2; i++)
for (int j=0; j<2; j++)
l[i][j]=s.next();
for (String v[]:f)
for (String w[]:l)
for (String x:v)
for (String y:w)
System.out.println(x+" "+y);
s.close();
}
}