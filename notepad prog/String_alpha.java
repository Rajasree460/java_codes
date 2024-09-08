/*string alpha sort*/
class String_alpha{
public static void main(String args[]){
String citynm[]=new String[args.length];
String temp;
for(int i=0;i<args.length;i++){
citynm[i]=args[i];
}
for(int i=0;i<citynm.length;i++){
for(int j=i+1;j<citynm.length;j++){
if(citynm[i].compareTo(citynm[j])>0){
temp=citynm[i];
citynm[i]=citynm[j];
citynm[j]=temp;
}
}
}
System.out.println("after sorting the array of string is:");
for(int i=0;i<citynm.length;i++){
System.out.println(citynm[i]);
}
}
}
