/*sorting in ascending order*/
import java.util.*;
public class Sorting_Ascending{
public static void main(String args[]){
int n,i,j,temp;
Scanner sc=new Scanner(System.in);
System.out.println("the size of array: ");
n=sc.nextInt();
int arr[]=new int[n];
System.out.println("take your array elements: ");
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
System.out.println("after sort the array is");
for(i=0;i<n;i++){
System.out.print(arr[i]+" ");
}
System.out.println();
}
}