/*string sorting alphabetically*/
public class String_Alphabetic_Sorting{
public static void main(String args[]){
int i,j;
String temp;
String cityname[]=new String[args.length];
for(i=0;i<args.length;i++){
cityname[i]=args[i];
}
for(i=0;i<args.length;i++){
for(j=i+1;j<args.length;j++){
if(cityname[i].compareTo(cityname[j])>0){
temp=cityname[i];
cityname[i]=cityname[j];
cityname[j]=temp;
}
}
}
System.out.println("after sorting: ");
for(i=0;i<args.length;i++){
System.out.println(cityname[i]);
}
}
}