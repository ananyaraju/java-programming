class labactivity
{
public static void main(String args[])
{
int n=args.length; n=n-5;
StringBuilder[] str=new StringBuilder[n];
StringBuilder[] x=new StringBuilder[n];
for (int i=0; i<n; i++)
x[i].append(args[i]);
int counter=0;
StringBuilder temp=new StringBuilder();
int length=str.length;
for (int i=1; i<=length-1; i++)
{
for (int j=i+1; j<=length; j++)
{
while(str[i].charAt(counter)==str[j].charAt(counter) && counter<str[i].length())
counter++;
if (str[i].charAt(counter)>str[j].charAt(counter))
{
temp=str[i];
str[i]=str[j];
str[j]=temp;
counter=0;
}
}
}
System.out.println("Sorted StringBuilder:");
for (int i=0; i<length; i++)
System.out.println(str[i]);
StringBuilder[] remove=new StringBuilder[5];
for (int i=0; i<5; i++)
remove[i].append(args[i]);
int c=0; 
for (int i=1; i<=length-1; i++)
{
for (int k=0; k<5; k++)
{
while(str[i].charAt(c)==remove[k].charAt(c) && c<str[i].length())
str[i].deleteCharAt(c);
}
int ctr=0;
StringBuilder t=new StringBuilder();
for (int u=1; u<=length-1; u++)
{
for (int v=u+1; v<=length; v++)
{
while(str[u].charAt(ctr)==str[v].charAt(ctr) && ctr<str[u].length())
ctr++;
if (str[u].charAt(ctr)>str[v].charAt(ctr))
{
t=str[u];
str[u]=str[v];
str[v]=t;
ctr=0;
}
}
}
System.out.println("Sorted StringBuilder:");
for (int s=0; s<length; s++)
System.out.println(str[s]);
}
}
}
