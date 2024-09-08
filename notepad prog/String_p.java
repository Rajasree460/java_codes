/*string palindrome*/
import java.util.*;
public class String_p{
public static void main(String args[]){
String x,t="";
int i;
char c;
Scanner sc=new Scanner(System.in);
System.out.println("enter a string: ");
x=sc.nextLine();
for(i=0;i<x.length();i++){
c=x.charAt(i);
t=c+t;
}
System.out.println("the new string is: "+t);
if(x.equals(t))
System.out.println("the string is palindrome");
else
System.out.println("the string isn't palindrome");
}
}