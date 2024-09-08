/*multithreading*/
import java.util.*;
import java.lang.Thread;
public class Multi_Threading{
public static void main(String args[]){
new Fibonacci().start();
new Prime().start();
}
}
class Fibonacci extends Thread{
public void run(){
int n=16;
int a=0,b=1,c;
System.out.println("fibonacci series is:");
System.out.println(a);
System.out.println(b);
for(int i=2;i<=n;i++){
c=a+b;
System.out.println(c);
a=b;
b=c;
try{
sleep(1000);
}
catch(Exception e){
}
}
System.out.println("exit from fibo");
}
}
class Prime extends Thread{
public void run(){
int n=16;
int i,j,ct;
for(i=1;i<=n;i++){
ct=0;
for(j=2;j<=(n/2);j++){
if(i%j==0){
ct=ct+1;
break;
}
}
if(ct==0){
System.out.println("prime: "+i);
}
try{
sleep(500);
}
catch(Exception e){
}
}
System.out.println("exit from prime");
}
}

