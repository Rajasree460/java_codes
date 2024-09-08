/*Rectangle area using command line arguments(mine)*/
class Rect_Area_cla
{
public static void main(String args[])
{
int i=Integer.parseInt(args[0]);
int j=Integer.parseInt(args[1]);
int k=Integer.parseInt(args[2]);
int l=Integer.parseInt(args[3]);
Rectangle r1=new Rectangle();
Rectangle r2=new Rectangle();
r1.getData(i,j);
r2.getData(k,l);
int a1=r1.rectArea();
int a2=r2.rectArea();
System.out.println("area of 1st rectangle: "+a1);
System.out.println("area of 2nd rectangle: "+a2);
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
int rectArea()
{
return(length*breadth);
}
}