/*prime in range(using BufferedReader class)*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class prime_range {
 public static void isPrime(int n)
 {
 int flag = 0;
 for(int i=2; i<=n/2; i++)
 {
 if (n%i == 0)
 {
 flag = 1;
 break;
 }
 }
 if (flag == 0)
 {
 System.out.println(n);
 }
 }
 public static void main(String[] args) throws IOException {
 BufferedReader br = new BufferedReader(new 
InputStreamReader(System.in));
 System.out.print("Enter the lower limit: ");
 int a = Integer.parseInt(br.readLine());
 System.out.print("Enter the upper limit: ");
 int b = Integer.parseInt(br.readLine());
 for(int i=a; i<=b; i++)
 {
 prime_range.isPrime(i);
 }
 }
}
