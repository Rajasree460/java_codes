/*method overloading*/
class Shape{
int length,breadth;
float height,base,radious;
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
class Method_ovrlding_srtc{
public static void main(String args[]){
int i=Integer.parseInt(args[0]);
int j=Integer.parseInt(args[1]);
float m=Float.parseFloat(args[2]);
float n=Float.parseFloat(args[3]);
float q=Float.parseFloat(args[4]);
Shape s1=new Shape(i,j);
Shape s2=new Shape(i);
Shape s3=new Shape(m,n);
Shape s4=new Shape(q);
System.out.println("rect area: "+s1.Area1());
System.out.println("sq area: "+s2.Area1());
System.out.println("tri area: "+s3.Area2());
System.out.println("cir area: "+s4.Area3());
}
}