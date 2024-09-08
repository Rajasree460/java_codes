/*by creating object & constructor*/
class Rectangle
{
  int length;
  int breadth;
  Rectangle(int x,int y)   //Rectangle=constructor
   {
     length=x;
     breadth=y;
    }
   int rectArea()
     {
       int area=length*breadth;
        return(area);
      }
}
class Constructor
{
  public static void main(String args[])
  {
    Rectangle r1=new Rectangle(5,10);
    Rectangle r2=new Rectangle(7,3);
    int area1=r1.rectArea();
    int area2=r2.rectArea();
    System.out.println("area of r1 is "+area1);
    System.out.println("area of r2 is "+area2);
   }
}