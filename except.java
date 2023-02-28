import java.util.*;
class except
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
try
{
int a=s.nextInt();
System.out.println(a);
}
catch (InputMismatchException e)
{
System.out.println("io mismatch");
}
catch(Exception e)
{
System.out.println("Generic exception");
}
finally
{
System.out.println("final block");
}
s.close();
}
}