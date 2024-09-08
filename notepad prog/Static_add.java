/*static method add*/
class Add
{
static int sum(int x,int y)
{
return(x+y);
}
}
class Static_add
{
public static void main(String args[])
{
int i=Integer.parseInt(args[0]);
int j=Integer.parseInt(args[1]);
int x=Add.sum(i,j);
System.out.println("summation result is: "+x);
}
}