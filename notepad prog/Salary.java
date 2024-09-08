/*cal salary inheritance*/
class Employee
{
int em_code;
String em_name,em_address;
long phm_no;
float da,hra;
Employee(float a,float b)
{
da=a;
hra=b;
}
}
}
class Teacher extends Employee
{
String specialization,designation;
super(a,b)
Teacher(float a,float b)
{
da=a;
hra=b;
}
void Cal_Salary_t(int basic_pay)
{
int Salary_t=da*basic_pay+hra*basic_pay;
}
System.out.println("salary of teachers: "+Salary_t);
}
}
class Office extends Employee
{
String designation;
super(a,b)
Office(float a,float b)
{
da=a;
hra=b;
}
void Cal_Salary_o(int basic_pay)
{
int Salary_o=da*basic_pay+hra*basic_pay;
}
System.out.println("salary of teachers: "+Salary_o);
}
}
class Salary
{
public static void main(String args[])
{
float i=Float.parseFloat(args[0]);
float j=Float.parseFloat(args[1]);
int m=Float.parseFloat(args[3]);
int n=Float.parseFloat(args[4]);
Teacher t1=new Teacher(i,j);
Office o1=new Office(i,j);
Cal_Salary_t(m);
Cal_Salary_o(n);
}
}

