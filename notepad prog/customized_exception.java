/*customized exception*/
import java.util.*;
class customized_exception{
public static void main(String args[]){
double a,b,div=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of dividand: ");
a=sc.nextDouble();
System.out.println("enter the value of dividand: ");
b=sc.nextDouble();
try{
div=a/b;
if(div==-1){
throw new ArithmeticException();
}
}
catch(ArithmeticException ex){
System.out.println("exception occured");
}
finally{
System.out.println("result :"+div);
}
}
}
