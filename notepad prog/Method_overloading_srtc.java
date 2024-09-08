/*method over loading*/
class Shape{
int length,breadth;
float radious,base,height;
Shape(int a,int b){
length=a;
breadth=b;
}
Shape(int a){
length=breadth=a;
}
Shape(float a,float b){
height=a;
base=b;
}
Shape(float a){
radious=a;
}
int Area1(){
return(length*breadth);
}
float Area2(){
return(.5f*height*base);
}
float Area3(){
return(3.14f*radious*radious);
}
}
class Method_overloading_srtc{
public static void main(String args[]){
int i=Integer.parseInt(args[0]);
int j=Integer.parseInt(args[1]);
int k=Integer.parseInt(args[2]);
float p=Float.parseFloat(args[3]);
float q=Float.parseFloat(args[4]);
float r=Float.parseFloat(args[5]);
Shape r1=new Shape(i,j);
Shape r2=new Shape(k);
Shape r3=new Shape(p,q);
Shape r4=new Shape(r);
System.out.println("rect area: "+r1.Area1());
System.out.println("sq area: "+r2.Area1());
System.out.println("tri area: "+r3.Area2());
System.out.println("cir area: "+r4.Area3());
}
}