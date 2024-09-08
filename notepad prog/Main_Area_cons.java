/*area by creating obj cons*/
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
class Main_Area_cons{
public static void main(String args[]){
Rectangle r1=new Rectangle(5,10);
Rectangle r2=new Rectangle(3,7);
System.out.println("1st rect area: "+r1.Area());
System.out.println("2nd rect area: "+r2.Area());
}
}