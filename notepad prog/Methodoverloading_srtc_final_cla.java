/*method overloading of srtc by cla_using final keyword*/
class Shape
{
int length,breadth;
float radious,height,base;
Shape(int x,int y)
{
length=x;
breadth=y;
}
Shape(int x)
{
breadth=length=x;
//breadth=x;
}
Shape(float x,float y)
{
base=x;
height=y;
}
Shape(float x)
{
radious=x;
}
int Area1()
{
return(length*breadth);
}
float Area2()
{
final float=.5;
return(.5f*base*height);
}
float Area3()
{
final float=3.14;
return(3.14f*radious*radious);
}
}
class Methodoverloading_srtc_final_cla
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
