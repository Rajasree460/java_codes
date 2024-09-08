/*cal salary inheritance*/
class employee{
String em_nm,address;
int em_code;
long phn_no;
float da,hra,salary;
employee(float a,float b){
da=a;
hra=b;
}
}
class teacher extends employee{
String designation,specalization;
teacher(float a,float b){
super(a,b);
da=a;
hra=b;
}
void cal_salary(int bp){
salary=da*bp+hra*bp;
System.out.println("teacher's salary: "+salary);
}
}
class office extends employee{
String designation,specalization;
office(float a,float b){
super(a,b);
da=a;
hra=b;
}
void cal_salary(int bp){
salary=da*bp+hra*bp;
System.out.println("teacher's salary: "+salary);
}
}
class inheritance_salary{
public static void main(String args[]){
float i=Float.parseFloat(args[0]);
float j=Float.parseFloat(args[1]);
int m=Integer.parseInt(args[2]);
int n=Integer.parseInt(args[3]);
teacher t1=new teacher(i,j);
office o1=new office(i,j);
t1.cal_salary(m);
o1.cal_salary(n);
}
}
