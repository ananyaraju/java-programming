interface inter{
public void test(){}
}
interface inter1{
public void test();
}
abstract class absinter1 implements inter1{
absinter1(){
System.out.println("inside abstract class");
}
public static void test(){
System.out.println("interface test method");
}
abstract void test1();
public static void main(String[] args){
System.out.println("test");
absinter1 abs=new TestInterface();
absinter1.test();
}
class TestInterface extends absinter1{
TestInterface(){
System.out.println("test1");
}
public void test1(){System.out.println("abstract Test method");}
}
}

//interface cant implement interface