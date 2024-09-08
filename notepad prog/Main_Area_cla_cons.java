/*area by creating obj,cla,cons*/
class Rectangle{
int length,breadth;
Rectangle(int a,int b){
length=a;
breadth=b;
}
int Area(){
return(length*breadth);
}
}
class Main_Area_cla_cons{
public static void main(String args[]){
int i=Integer.parseInt(args[0]);
int j=Integer.parseInt(args[1]);
int m=Integer.parseInt(args[2]);
int n=Integer.parseInt(args[3]);
Rectangle r1=new Rectangle(i,j);
Rectangle r2=new Rectangle(m,n);
System.out.println("1st rect area: "+r1.Area());
System.out.println("2nd rect area: "+r2.Area());
}
}