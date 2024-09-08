/*catch invalid cla*/
class invalid_exception{
public static void main(String args[]){
int invalid=0,ct=0,num;
for(int i=0;i<args.length;i++){
try{
num=Integer.parseInt(args[i]);
}
catch(NumberFormatException e){
invalid=invalid+1;
System.out.println("invalid cla is: "+args[i]);
continue;
}
ct=ct+1;
//System.out.println("valid cla is: "+args[i]);
}
System.out.println("no of invalid cla: "+invalid);
System.out.println("no of valid cla: "+ct);
}
}