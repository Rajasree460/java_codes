/*Rectangle area using command line arguments & constructor*/
class Rect_Area_cla_cons
{
public static void main(String args[])
{
int i=Integer.parseInt(args[0]);
int j=Integer.parseInt(args[1]);
int k=Integer.parseInt(args[2]);
int l=Integer.parseInt(args[3]);
Rectangle r1=new Rectangle(i,j);
Rectangle r2=new Rectangle(k,l);
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