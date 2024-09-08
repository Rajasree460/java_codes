/*static method add,div,mul,sub cla*/
class Operation
{
static int sum(int x,int y)
{
return(x+y);
}
static int sub(int x,int y)
{
return(x-y);
}
static int mul(int x,int y)
{
return(x*y);
}
static int div(int x,int y)
{
return(x/y);
}
}
class Static_add_mul_div_sub
{
public static void main(String args[])
{
int i=Integer.parseInt(args[0]);
int j=Integer.parseInt(args[1]);
int x=Operation.sum(i,j);
int y=Operation.sub(i,j);
int z=Operation.mul(i,j);
int w=Operation.div(i,j);
System.out.println("summation result is: "+x);
System.out.println("subtraction result is: "+y);
System.out.println("multiplication result is: "+z);
System.out.println("division result is: "+w);
}
}