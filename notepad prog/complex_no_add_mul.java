/*complex no add and mul*/
class Complex{
float real,img;
Complex(){
real=0;
img=0;
}
Complex(float a,float b){
real=a;
img=b;
}
void Display(Complex c1,Complex c2){
System.out.println("1st no:("+c1.real+") + ("+c1.img+")i");
System.out.println("2nd no:("+c2.real+") + ("+c2.img+")i");
}
void Add(Complex c1,Complex c2){
System.out.println("add res:("+(c1.real+c2.real)+") + ("+(c1.img+c2.img)+")i");
}
void Mul(Complex c1,Complex c2){
System.out.println("mul res:("+(c1.real*c2.real-c1.img*c2.img)+") + ("+(c1.img*c2.real+c1.real*c2.img)+")i");
}
}
public class complex_no_add_mul{
public static void main(String args[]){
float num1,num2;
Complex cal=new Complex();
num1=Float.parseFloat(args[0]);
num2=Float.parseFloat(args[1]);
Complex com1=new Complex(num1,num2);
num1=Float.parseFloat(args[2]);
num2=Float.parseFloat(args[3]);
Complex com2=new Complex(num1,num2);
System.out.println("\n");
cal.Display(com1,com2);
System.out.println("\n");
cal.Add(com1,com2);
cal.Mul(com1,com2);
}
}