/*by declearing static method(no need to create any object,as it is a static method),constructor & CLA_other way*/
class operation1_p
{
  static int summation(int a,int b)
   {
      return(a+b);

   }
  static int subtraction(int a,int b)
   {
      return(a-b);
   }
  static int multiplication(int a,int b)
   {
      return(a*b);
   }
  static int division(int a,int b)
   {
      return(a/b);
   }

  static void print_a(int a)
   {
      System.out.println("addition is: "+a);   //this int a and prv int a aren;t same,this int a=value of x
   }
   static void print_s(int a)
   {
      System.out.println("subtraction is: "+a);   //this int a and prv int a aren;t same,this int a=value of x
   }
   static void print_m(int a)
   {
      System.out.println("multiplication is: "+a);   //this int a and prv int a aren;t same,this int a=value of x
   }
   static void print_d(int a)
   {
      System.out.println("division is: "+a);   //this int a and prv int a aren;t same,this int a=value of x
   }
}
class Operation_p
{
  public static void main(String args[])
  {
    int i=Integer.parseInt(args[0]);
    int j=Integer.parseInt(args[1]);   //if we  use static method then we don't have to create obj
    int x=operation1_p.summation(i,j);
    int y=operation1_p.subtraction(i,j);
    int m=operation1_p.multiplication(i,j);
    int n=operation1_p.division(i,j);
    operation1_p.print_a(x);
    operation1_p.print_s(y);
    operation1_p.print_m(m);
    operation1_p.print_d(n);
  }
}
