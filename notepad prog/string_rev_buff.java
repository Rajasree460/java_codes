/*string rev and print (using BufferedReader class)*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class string_rev_buff {
 public static void main(String[] args) throws IOException {
 BufferedReader br = new BufferedReader(new 
InputStreamReader(System.in));
 System.out.print("Enter the String: ");
 String x = br.readLine();
 String t=" ";
 char c;
 int i;
 for(i=0;i<x.length();i++){
    c=x.charAt(i);
    t=c+t;
 }
 System.out.println("the reversed string is: "+t);
}
}