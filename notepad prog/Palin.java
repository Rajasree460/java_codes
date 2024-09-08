/*string palin*/
import java.util.*;
class Palin{
public static void main(String args[]){
String x,t;
t="";
Scanner sc=new Scanner(System.in);
System.out.println("take ur string:");
x=sc.nextLine();
int i;
char c;
for(i=0;i<x.length();i++){
c=x.charAt(i);
t=c+t;
}
System.out.println("new string is: "+t);
if(x.equals(t))
System.out.println("p");
else
System.out.println("not p");
}
}