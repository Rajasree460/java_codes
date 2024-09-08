/*method overloading using cla*/
class Overloading_cla
{
public static void main(String args[])
{
int i=Integer.parseInt(args[0]);
int j=Integer.parseInt(args[1]);
Room r1=new Room(i,j);
Room r2=new Room(i);
//int a1=r1.rectArea();
//int a2=r2.rectArea();
System.out.println("area of rectangle: "+r1.Area());
System.out.println("area of square: "+r2.Area());
//System.out.println("area of rectangle: "+a1);
//System.out.println("area of square: "+a2);
}
}
class Room
{
int length,breadth;
Room(int x,int y)
{
length=x;
breadth=y;
}
Room(int x)
{
length=breadth=x;
}
int Area()
{
return(length*breadth);
}
}