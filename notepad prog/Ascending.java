/*sorting ascending*/
import java.util.*;
class Ascending{
public static void main(String args[]){
int n,i,j,temp;
Scanner sc=new Scanner(System.in);
System.out.println("enter the array size:");
n=sc.nextInt();
int arr[]=new int[n];
System.out.println("take ur array elements:");
for(i=0;i<n;i++){
arr[i]=sc.nextInt();
}
for(i=0;i<n;i++){
for(j=i+1;j<n;j++){
if(arr[i]>arr[j]){
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
System.out.println("array in ascending order:");
for(i=0;i<n;i++){
System.out.print(arr[i]+" ");
}
}
}