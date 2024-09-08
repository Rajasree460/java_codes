/*catch invalid of cla*/
class catch_invalid{
public static void main(String args[]){
int invalid=0,ct=0,num;
for(int i=0;i<args.length;i++){
try{
num=Integer.parseInt(args[i]);
}
catch(NumberFormatException e){
invalid=invalid+1;
System.out.println("the invalid cla: "+args[i]);
continue;
}
ct=ct+1;
}
System.out.println("the no. of invalid nums: "+invalid);
System.out.println("the no. of valid nums: "+ct);
}
}
