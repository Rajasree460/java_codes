/*area by creating obj constructor*/
public class Area_obj_cons_cla{
public static void main(String args[]){
int i=Integer.parseInt(args[0]);
int j=Integer.parseInt(args[1]);
int p=Integer.parseInt(args[2]);
int q=Integer.parseInt(args[3]);
Rectangle r1=new Rectangle(i,j);
Rectangle r2=new Rectangle(p,q);
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