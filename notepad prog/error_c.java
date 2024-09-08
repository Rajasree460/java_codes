/*customised exception*/
import java.util.*;
class error_c{
public static void main(String args[]){
double a,b,div=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter 1st no:");
a=sc.nextDouble();
System.out.println("enter 2nd no:");
b=sc.nextDouble();
try{
div=a/b;
if(div==-1){
throw new ArithmeticException();
}
}
catch(ArithmeticException e){
System.out.println("exception occured");
}
finally{
System.out.println("result: "+div);
}
}
}
