/*by declearing static method(no need to create any object,as it is a static method),constructor & CLA*/
class Add
{
  static int summation(int a,int b)
   {
      return(a+b);

   }
}
class Addition
{
  public static void main(String args[])
  {
    int i=Integer.parseInt(args[0]);
    int j=Integer.parseInt(args[1]);   //if we  use static method then we don't have to create obj
    int x=Add.summation(i,j);
    System.out.println("sum is: "+x);
  }
}