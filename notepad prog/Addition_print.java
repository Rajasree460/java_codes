/*by declearing static method(no need to create any object,as it is a static method),constructor & CLA_other way*/
class Add_p
{
  static int summation(int a,int b)
   {
      return(a+b);

   }
  static void print(int a)
   {
      System.out.println("sum is: "+a);   //this int a and prv int a aren;t same,this int a=value of x
   }
}
class Addition_print
{
  public static void main(String args[])
  {
    int i=Integer.parseInt(args[0]);
    int j=Integer.parseInt(args[1]);   //if we  use static method then we don't have to create obj
    int x=Add_p.summation(i,j);
    Add.print(x);
  }
}
