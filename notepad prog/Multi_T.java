/*multithreading*/
import java.lang.Thread;
class Multi_T{
public static void main(String args[]){
new fibonacci().start();
new prime().start();
}
}
class fibonacci extends Thread{
public void run(){
int n=16;
int i,a=0,b=1,c;
System.out.println("fibo series:");
System.out.println(a);
System.out.println(b);
for(i=2;i<=n;i++){
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
class prime extends Thread{
public void run(){
int n=16;
int i,j,ct;
for(i=1;i<=n;i++){
ct=0;
for(j=2;j<=(n/2);j++){
if(i%j==0){
ct++;
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
