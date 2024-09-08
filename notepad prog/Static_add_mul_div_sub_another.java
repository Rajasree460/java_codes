/*static method add,div,mul,sub cla other way_1*/
class Operation_1
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
static void print(int a)
{
System.out.println("result is: "+a);
}
}
class Static_add_mul_div_sub_another
{
public static void main(String args[])
{
int i=Integer.parseInt(args[0]);
int j=Integer.parseInt(args[1]);
int x=Operation_1.sum(i,j);
int y=Operation_1.sub(i,j);
int z=Operation_1.mul(i,j);
int w=Operation_1.div(i,j);
Operation_1.print(x);
Operation_1.print(y);
Operation_1.print(z);
Operation_1.print(w);
}
}