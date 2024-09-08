/*static method add sub mul div*/
class Operation{
static int Add(int a,int b){
return(a+b);
}
static int Sub(int a,int b){
return(a-b);
}
static int Mul(int a,int b){
return(a*b);
}
static int Div(int a,int b){
return(a/b);
}
}
class Static_Method_Operation{
public static void main(String args[]){
int i=Integer.parseInt(args[0]);
int j=Integer.parseInt(args[1]);
int x=Operation.Add(i,j);
int y=Operation.Sub(i,j);
int p=Operation.Mul(i,j);
int q=Operation.Div(i,j);
System.out.println("add result: "+x);
System.out.println("sub result: "+y);
System.out.println("mul result: "+p);
System.out.println("div result: "+q);
}
}