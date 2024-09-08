/*static method*/
class operation{
static int add(int a,int b){
return(a+b);
}
static int sub(int a,int b){
return(a-b);
}
static int mul(int a,int b){
return(a*b);
}
static int div(int a,int b){
return(a/b);
}
}
class Static_op{
public static void main(String args[]){
int i=Integer.parseInt(args[0]);
int j=Integer.parseInt(args[1]);
int x=operation.add(i,j);
int y=operation.mul(i,j);
int m=operation.sub(i,j);
int n=operation.div(i,j);
System.out.println("add res: "+x);
System.out.println("sub res: "+y);
System.out.println("mul res: "+m);
System.out.println("div res: "+n);
}
}