/*method overloading*/
class Room{
int length,breadth;
Room(int a,int b){
length=a;
breadth=b;
}
Room(int a){
length=breadth=a;
}
int Area(){
return(length*breadth);
}
}
class Method_ovrlding_sr{
public static void main(String args[]){
int i=Integer.parseInt(args[0]);
int j=Integer.parseInt(args[1]);
Room r1=new Room(i,j);
Room r2=new Room(i);
System.out.println("rect area: "+r1.Area());
System.out.println("sq area: "+r2.Area());
}
}