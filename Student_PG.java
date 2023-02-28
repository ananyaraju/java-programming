import java.util.*;

class Person
{
String name, address; long phone;
void get_details(String name, String address, long phone)
{
this.name=name; //1st use of this keyword
this.address=address;
this.phone=phone; 
}
void put_details() //prints details
{
System.out.println();
System.out.println("Personal Details:");
System.out.print("Address: " +this.address+ "     ");
System.out.print("Phone: " +this.phone+ "     ");
System.out.println();
}
}

class Student_UG
{
String student_name, reg_no, student_address, email;
long student_phonenumber; 
float gpa[]=new float[8];
Student_UG()//default constructor
{
for (int i=0; i<8; i++)
gpa[i]=4; //since it is assumed this system is only for people who have completed PG Degree, student has to have minimum passing GPA
}
void get_UG_details(String student_name, String reg_no, String student_address, String email, long student_phonenumber, float gpa[])
{
this.student_name=student_name;
this.reg_no=reg_no;
this.student_address=student_address;
this.email=email;
this.student_phonenumber=student_phonenumber;
for (int i=0; i<8; i++)
this.gpa[i]=gpa[i];
}
void put_UG_details()
{
System.out.println();
System.out.println("UG Details:");
System.out.print("Registration No.: "+this.reg_no+ "     ");
System.out.print("Address: "+this.student_address+ "     ");
System.out.print("Email: "+this.email+ "     ");
System.out.print("Phone: "+this.student_phonenumber+ "     ");
System.out.print("GPAs: ");
for (int i=0; i<8; i++)
System.out.print(gpa[i]+"  ");
}
Student_UG(String student_name)
{
this.put_UG_details(); //2nd use of this keyword
}
}

class Student_PG //main class
{
String student_name, reg_no, student_address, email;
long student_phonenumber;
float gpa[]=new float[4];
void get_PG_details(String student_name, String reg_no, String student_address, String email, long student_phonenumber, float gpa[])
{
this.student_name=student_name;
this.reg_no=reg_no;
this.student_address=student_address;
this.email=email;
this.student_phonenumber=student_phonenumber;
for (int i=0; i<4; i++)
this.gpa[i]=gpa[i];
}
void get_PG_details(String student_name, String reg_no, String student_address, String email, float gpa[])
{ //method overloading
this.student_name=student_name;
this.reg_no=reg_no;
this.student_address=student_address;
this.email=email;
//this.student_phonenumber=student_phonenumber;
for (int i=0; i<4; i++)
this.gpa[i]=gpa[i];
}
void put_PG_details()
{
System.out.println("PG Details:");
System.out.print("Registration No.: "+this.reg_no+ "     "); //3rd use of this keyword
System.out.print("Address: "+this.student_address+ "     ");
System.out.print("Email: "+this.email+ "     ");
System.out.print("Phone: "+this.student_phonenumber+ "     ");
System.out.print("GPAs: ");
for (int i=0; i<4; i++)
System.out.print(gpa[i]+"  ");
}
void check_eligibility(Student_PG pg)
{
int c=0;
for (int i=0; i<4; i++)
if (this.gpa[i]==0)
c++;
if (c==0)
System.out.println(this.student_name+" is eligible to use this system."); //4th use of this keyword
}

public static void main(String args[]) //main method
{
Person p[]=new Person[5]; //use of array of objects
Student_UG ugstu[]=new Student_UG[5];
Student_PG pgstu[]=new Student_PG[5];
Scanner s=new Scanner(System.in);
String n, r, a, em; long ph; float g_pg[]=new float[4]; float g_ug[]=new float[8];
System.out.println("Enter PG Details of 5 Students:");
for (int i=0; i<5; i++)
{
n=s.next();
r=s.next();
a=s.next();
em=s.next();
ph=s.nextLong();
for (int j=0; j<4; j++)
g_pg[j]=s.nextFloat();
pgstu[i]=new Student_PG();
pgstu[i].get_PG_details(n,r,a,em,ph,g_pg);
}
System.out.println();
System.out.println("Enter UG Details of 5 Students:");
for (int i=0; i<5; i++)
{
n=s.next();
r=s.next();
a=s.next();
em=s.next();
ph=s.nextLong();
for (int j=0; j<8; j++)
g_ug[j]=s.nextFloat();
ugstu[i]=new Student_UG();
ugstu[i].get_UG_details(n,r,a,em,ph,g_ug);
}
System.out.println();
System.out.println("Enter personal information of 5 Students: ");
for (int i=0; i<5; i++)
{
n=s.next();
a=s.next();
ph=s.nextLong();
p[i]=new Person();
p[i].get_details(n,a,ph);
}
System.out.println(); System.out.println();
System.out.println("Student Information System Data:");
System.out.println();
for (int i=0; i<5; i++)
{
System.out.println(pgstu[i].student_name+"'s details:");
pgstu[i].check_eligibility(pgstu[i]);
pgstu[i].put_PG_details();
for (int j=0; j<5; j++) //searching for same student's UG details
	if (ugstu[j].student_name.equals(pgstu[i].student_name))
		ugstu[j].put_UG_details();
for (int j=0; j<5; j++) //searching for same student's personal details
	if (p[j].name.equals(pgstu[i].student_name))
		p[j].put_details();
System.out.println();
s.close();
}
}
}













