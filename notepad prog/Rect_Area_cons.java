/*Rectangle area using constructor*/
class Rect_Area_cons
{
public static void main(String args[])
{
Rectangle r1=new Rectangle(5,10);
Rectangle r2=new Rectangle(7,3);
int a1=r1.rectArea();
int a2=r2.rectArea();
System.out.println("area of 1st rectangle: "+a1);
System.out.println("area of 2nd rectangle: "+a2);
}
}
class Rectangle
{
int length,breadth;
Rectangle(int x,int y)
{
length=x;
breadth=y;
}
int rectArea()
{
return(length*breadth);
}
}