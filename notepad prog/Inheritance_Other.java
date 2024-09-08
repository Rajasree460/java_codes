/*inheritance cal salary_another*/
class Inheritance_Other{
public static void main(String args[]){
float i=Float.parseFloat(args[0]);
float j=Float.parseFloat(args[1]);
int p=Integer.parseInt(args[2]);
int q=Integer.parseInt(args[3]);
Employee e1=new Employee(i,j);
//Teacher t1=new Teacher(i,j);
//Office o1=new Office(i,j);
t1.calSalary(p);
o1.calSalary(q);
}
}
class Employee{
String em_name,address;
long phn_no;
int em_code;
float da,hra,salary;
Employee(float a,float b){
da=a;
hra=b;
}
}
class Teacher extends Employee{
String specilization,designation;
/*Teacher(float a,float b){
super(a,b);
da=a;
hra=b;
}*/
void calSalary(int basic_pay){
salary=da*basic_pay+hra*basic_pay;
System.out.println("the salary of teachers: "+salary);
} 
}
class Office extends Employee{
String designation;
/*Office(float a,float b){
super(a,b);
da=a;
hra=b;
}*/
void calSalary(int basic_pay){
salary=da*basic_pay+hra*basic_pay;
System.out.println("the salary of officers: "+salary);
} 
}
