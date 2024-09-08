/*sort string alphabetically*/
public class sort_string_alphabetically_o{
public static void main(String args[]){
String cityname[]=new String[args.length];
for(int i=0;i<cityname.length;i++){
cityname[i]=args[i];
}
for(int i=0;i<cityname.length;i++){
for(int j=i+1;j<cityname.length;j++){
if(cityname[i].compareTo(cityname[j])>0){
String temp=cityname[i];
cityname[i]=cityname[j];
cityname[j]=temp;
}
}
}
System.out.println("after sorting the result is:");
for(int i=0;i<cityname.length;i++){
System.out.println(cityname[i]);
}
}
}