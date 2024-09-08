/*method overload(overload area c s)buff*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Shape
{
 float calculateArea(float r)
 {
 return(3.14f*r*r);
 }
 int calculateArea(int l)
 {
 return(l*l);
 }
}
class method_overload_sc
{
 public static void main(String [] args) throws IOException
 {
 BufferedReader br = new BufferedReader(new 
InputStreamReader(System.in));
 System.out.print("Enter the radius: ");
 float r = Float.parseFloat(br.readLine());
 System.out.print("Enter the length: ");
 int l = Integer.parseInt(br.readLine());
 Shape s1 = new Shape();
 System.out.println("circ area: "+s1.calculateArea(r));
 System.out.println("sq area: "+s1.calculateArea(l));
 }
}

