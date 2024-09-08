/*area by creating obj*/
public class Area_obj{
public static void main(String args[]){
Rectangle r1=new Rectangle();
r1.getData(5,6);
int area=r1.Rect_Area();
System.out.println("the area of the rectangle: "+area);
//System.out.println("the area of the rectangle: "+r1.Rect_Area());
}
}
class Rectangle{
int length,breadth;
void getData(int a,int b){
length=a;
breadth=b;
}
int Rect_Area(){
return(length*breadth);
}
}