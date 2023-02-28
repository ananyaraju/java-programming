class testexception {
static void method1() {
int d=0;
try {
int a=10/d;
int c[]={0};
c[40]=50;
System.out.println(a);
}
catch(ArithmeticException ae){
System.out.println("divide by 0");
}
System.out.println("after first try");
try {
method2();
} catch(ArrayIndexOutOfBoundsException ao){
System.out.println("index out of bounds");
}
}
static void method2(){
int c[]={0};
try {
c[40]=50;
}
catch(Exception e){throw e;}
}
public static void main(String[] args){
try{
testexception.method1();
System.out.println("in main");
}
catch(Exception e){
e.printStackTrace();
System.out.println("caught in exception");
}
finally{
System.out.println("Handled");
}
System.out.println("continue oustide main");
}
}