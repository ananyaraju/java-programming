class returnvalue
{
static int test(int a)
{
if (a==0) return 0;
else return 1;
}
public static void main(String args[])
{
int x=Integer.parseInt(args[0]);
int y=Integer.parseInt(args[1]);
test(x);
test(y);

}
}