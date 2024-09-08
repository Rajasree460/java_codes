/*method overloading(rectangle,squre)*/
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
class Overloading_sr
 { 
   public static void main(String args[])
     { 
       int i=Integer.parseInt(args[0]);
       int j=Integer.parseInt(args[1]);
       int k=Integer.parseInt(args[2]);
       Room r1=new Room(i,j);
       Room r2=new Room(k);
       System.out.println("area of r1 is: "+r1.area());
       System.out.println("area of r2 is: "+r2.area());
     }
}