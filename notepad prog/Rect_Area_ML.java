/*rectangle area(method overload,no cla)mine*/
class Rect_Area_ML
{
public static void main(String args[])
{
Rectangle r1=new Rectangle();
Rectangle r2=new Rectangle();
r1.getData(5,10);
r1.getData(5);
r2.getData(7,3);
r2.getData(7);
int a1=r1.rectArea();
int a2=r2.rectArea();
int a3=r1.Area();
int a4=r2.Area();
System.out.println("area of 1st rectangle: "+a1);
System.out.println("area of 2nd rectangle: "+a2);
System.out.println("area of 1st rectangle_sq: "+a3);
System.out.println("area of 2nd rectangle_sq: "+a4);
}
}
class Rectangle
{
int length,breadth;
void getData(int x,int y)
{
length=x;
breadth=y;
}
void getData(int a)
{
length=a;
}
int rectArea()
{
return(length*breadth);
}
int Area()
{
return(length*length);
}
}