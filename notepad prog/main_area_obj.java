/*area obj*/
class obj{
int length,breadth;
void getdata(int a,int b){
length=a;
breadth=b;
}
int area(){
return(length*breadth);
}
}
class main_area_obj{
public static void main(String args[]){
obj o1=new obj();
obj o2=new obj();
o1.getdata(5,10);
o2.getdata(3,7);
System.out.println("the area of 1st rec:"+o1.area());
System.out.println("the area of 2nd rec:"+o2.area());
}
}
