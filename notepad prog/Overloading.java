/*method overloading(rectangle,squre)without CLA*/
class Room
{ 
  int length;
  int breadth;
  Room(int a,int b) //assuming rectangle
   {
     length=a;
     breadth=b;
   }
  Room(int a)     //assuming square
   {
     length=breadth=a;
   }
  int area()
   {
     return(length*breadth);
   }
}
class Overloading
 { 
   public static void main(String args[])
     { 
       Room r1=new Room(5,6);
       Room r2=new Room(5);
       System.out.println("area of r1 is: "+r1.area());
       System.out.println("area of r2 is: "+r2.area());
     }
}