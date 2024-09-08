/*area by creating obj constructor*/
public class Area_obj_cons{
public static void main(String args[]){
Rectangle r1=new Rectangle(5,6);
Rectangle r2=new Rectangle(3,7);
System.out.println("the area of the rectangle 1: "+r1.Rect_Area());
System.out.println("the area of the rectangle 2: "+r2.Rect_Area());
}
}
class Rectangle{
int length,breadth;
Rectangle(int a,int b){
length=a;
breadth=b;
}
int Rect_Area(){
return(length*breadth);
}
}