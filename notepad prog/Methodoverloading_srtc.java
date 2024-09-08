/*method overloading of srtc other way*/
class Shape
{
int d1,d2;
float d3,d4;
Shape(int x,int y)
{
d1=x;
d2=y;
}
Shape(int x)
{
d1=d2=x;
}
Shape(float x,float y)
{
d3=x;
d4=y;
}
Shape(float x)
{
d3=x;
}
int Area1()
{
return(d1*d2);
}
float Area2()
{
return(.5f*d3*d4);
}
float Area3()
{
return(3.14f*d3*d3);
}
}
class Methodoverloading_srtc
{
public static void main(String args[])
{
int i=Integer.parseInt(args[0]);
int j=Integer.parseInt(args[1]);
int k=Integer.parseInt(args[2]);
float m=Float.parseFloat(args[3]);
float n=Float.parseFloat(args[4]);
float p=Float.parseFloat(args[5]);
Shape r1=new Shape(i,j);
Shape r2=new Shape(k);
Shape r3=new Shape(m,n);
Shape r4=new Shape(p);
System.out.println("area of rectangle: "+r1.Area1());
System.out.println("area of square: "+r2.Area1());
System.out.println("area of triangle: "+r3.Area2());
System.out.println("area of circle: "+r4.Area3());
}
}
