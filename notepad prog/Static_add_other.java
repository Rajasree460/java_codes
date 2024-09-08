/*static method add_other way*/
class Add
{
static int sum(int x,int y)
{
return(x+y);
}
static void print(int x)
{
System.out.println("summation result is: "+x);
}
}
class Static_add_other
{
public static void main(String args[])
{
int i=Integer.parseInt(args[0]);
int j=Integer.parseInt(args[1]);
int x=Add.sum(i,j);
Add.print(x);
}
}