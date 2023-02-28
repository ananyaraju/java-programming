abstract class Test{
int a=10;
Test(){
System.out.println("a= "+a);
}
Test(int a, int b){
System.out.println("a+ "+a+"b= "+b);
}
}
class TestChild extends Test{
int a=4;
TestChild(){
this(5.0);
System.out.println("inside default no parameter constructor");
}
TestChild(int b){
super(b,b);
System.out.println("inside int paramter constructor"+b);
new TestChild();
}
TestChild(int b, int a){
this(a);
System.out.println("inside int, int paramter constructor"+b);
}
TestChild(double d){
super();
System.out.println("inside double paramter constructor"+d);
}
public static void main(String[] args){
new TestChild();
new TestChild(5);
}
}