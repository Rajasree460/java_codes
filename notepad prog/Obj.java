/*by creating object*/
class Rectangle
{
  int length;
  int breadth;
  void getData(int x,int y)
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
class Obj
{
  public static void main(String args[])
  {
    Rectangle r1=new Rectangle();
    Rectangle r2=new Rectangle();
    r1.getData(5,10);
    r2.getData(7,3);
    int area1=r1.rectArea();
    int area2=r2.rectArea();
    System.out.println("area of r1 is "+area1);
    System.out.println("area of r2 is "+area2);
   }
}