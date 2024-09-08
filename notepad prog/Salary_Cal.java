/*cal salary inheritance*/
class Employee
{
int em_code;
String em_name,em_address;
long phm_no;
float da,hra,Salary;
Employee(float a,float b)
{
da=a;
hra=b;
}
}

class Teacher extends Employee
{
String specialization,designation;
Teacher(float a,float b)
{
super(a,b);
da=a;
hra=b;
}
void Cal_Salary_t(int basic_pay)
{
Salary=da*basic_pay+hra*basic_pay;
System.out.println("salary of teachers: "+Salary);
}
}

class Office extends Employee
{
String designation;
Office(float a,float b)
{
super(a,b);
da=a;
hra=b;
}
void Cal_Salary_o(int basic_pay)
{
Salary=da*basic_pay+hra*basic_pay;
System.out.println("salary of offices: "+Salary);
}
}

class Salary_Cal
{
public static void main(String args[])
{
float i=Float.parseFloat(args[0]);
float j=Float.parseFloat(args[1]);
int m=Integer.parseInt(args[2]);
int n=Integer.parseInt(args[3]);
Teacher t1=new Teacher(i,j);
Office o1=new Office(i,j);
t1.Cal_Salary_t(m);
o1.Cal_Salary_o(n);
}
}

