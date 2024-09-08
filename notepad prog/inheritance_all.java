/*inheritance,method overloading,method overriding*/
class A
{
  int x;
  float y;
  void m()
   {
     System.out.println("hello");
   }
   void m(int a1)
   {
     System.out.println("the val passed in this method is: "+a1);
   }
}
class B extends A
{
  int a;
  float b;
  void n()
   {
     
   }
  void m()
   {
    System.out.println("hii");
   }
  void m(int a2)
   {
    System.out.println("the val passed in this method is: "+a2);
   } 
}
class inheritance_all
{
  public static void main(String args[])
  {
   B B1=new B();
   A A1=new A();
   B1.a=5;
   B1.x=7;
   B1.m();
   B1.m(5);
   A1.m();
   A1.m(5);
  }
}