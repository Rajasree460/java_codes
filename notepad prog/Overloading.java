/*method overloading without cla*/
class Overloading
{
public static void main(String args[])
{
Room r1=new Room(5,6);
Room r2=new Room(5);
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