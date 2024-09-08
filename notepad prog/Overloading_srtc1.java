/*method overloading(rectangle,squre,triangle,circle)another way*/
class Shape
{ 
  int d1,d2;
  float d3,d4;
  Shape(int a,int b) //assuming rectangle
   {
     d1=a;
     d2=b;
   }
  Shape(int a)     //assuming square
   {
     d1=d2=a;
   }
  Shape(float a,float b)  //triangle
   {
     d3=a;
     d4=b;
   }
  Shape(float a)     //circle
   {
     d3=a;
   }
  int area()
   {
     return(d1*d2);
   }
  float area_t()
   {
     return(.5f*d3*d4);
   }
  float calcArea()
   {
     return(3.14f*d3*d3);
   }
}
class Overloading_srtc1
 { 
   public static void main(String args[])
     { 
       int i=Integer.parseInt(args[0]);
       int j=Integer.parseInt(args[1]);
       int k=Integer.parseInt(args[2]);
       float p=Float.parseFloat(args[3]);
       float q=Float.parseFloat(args[4]);
       float m=Float.parseFloat(args[5]);
       Shape r1=new Shape(i,j);
       Shape r2=new Shape(k);
       Shape r3=new Shape(p,q);
       Shape r4=new Shape(m);
       System.out.println("area of r1 is: "+r1.area());
       System.out.println("area of r2 is: "+r2.area());
       System.out.println("area of r3 is: "+r3.area_t());
       System.out.println("area of r4 is: "+r4.calcArea());
     }
}