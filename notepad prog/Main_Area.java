/*area by creating obj*/
class Rectangle{
int length,breadth;
void getData(int a,int b){
length=a;
breadth=b;
}
int Area(){
return(length*breadth);
}
}
class Main_Area{
public static void main(String args[]){
Rectangle r1=new Rectangle();
Rectangle r2=new Rectangle();
r1.getData(5,6);
r2.getData(3,7);
System.out.println("1st rect area: "+r1.Area());
System.out.println("2nd rect area: "+r2.Area());
}
}