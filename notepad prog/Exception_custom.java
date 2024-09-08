/*exception handelling customized*/
import java.util.*;
class Exception_custom{
public static void main(String args[]){
double a,b,div=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter dividand:");
a=sc.nextDouble();
System.out.println("enter divisor:");
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
System.out.println("res: "+div);
}
}
}