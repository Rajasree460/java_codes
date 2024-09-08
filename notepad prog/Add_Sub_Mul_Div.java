/*by declearing static method(no need to create any object,as it is a static method) ,constructor & CLA*/
class operation1
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
}
class Add_Sub_Mul_Div
{
  public static void main(String args[])
  {
    int i=Integer.parseInt(args[0]);
    int j=Integer.parseInt(args[1]);   //if we  use static method then we don't have to create obj
    int x=operation1.summation(i,j);
    int y=operation1.subtraction(i,j);
    int m=operation1.multiplication(i,j);
    int n=operation1.division(i,j);
    System.out.println("sum is: "+x);
    System.out.println("subtraction is: "+y);
    System.out.println("multiplication is: "+m);
    System.out.println("division is: "+n);
  }
}
