/*inheritance*/
class A
{
  int x;
  float y;
  void m()
   {
     System.out.println("hello");
   }
  //System.out.println(x);
}
class B extends A
{
  int a;
  float b;
  void n()
   {
     System.out.println("hii");
   }
 //System.out.println(a);
}
class inheritance
{
  public static void main(String args[])
  {
   B B1=new B();
   B1.a=5;
   B1.x=7;
   B1.m();
  }
}