/*by creating object,constructor & command line arguments*/
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
class Constructor_c
{
  public static void main(String args[])
  {
    int i=Integer.parseInt(args[0]);
    int j=Integer.parseInt(args[1]);
    int p=Integer.parseInt(args[2]);
    int q=Integer.parseInt(args[3]);
    Rectangle r1=new Rectangle(i,j);
    Rectangle r2=new Rectangle(p,q);
    int area1=r1.rectArea();
    int area2=r2.rectArea();
    System.out.println("area of r1 is "+area1);
    System.out.println("area of r2 is "+area2);
   }
}