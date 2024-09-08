/*abstruct class (cal area s c)*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
abstract class Shape
{
 abstract public void area(int a) throws IOException;
}
class Square extends Shape
{
 public void area(int l){
 System.out.println("sq area: "+l*l);
 }
}
class Circle extends Shape
{
 public void area(int r)
 {
 System.out.println("circle area: "+3.14f*r*r);
 }
}
public class abstruct_class {
 public static void main(String[] args) throws IOException{
 BufferedReader br = new BufferedReader((new 
InputStreamReader(System.in)));
 System.out.print("Enter the length: ");
 int l = Integer.parseInt(br.readLine());
 System.out.print("Enter the radius: ");
 int r = Integer.parseInt(br.readLine());
 Square s1 = new Square();
 s1.area(l);
 Circle c1 = new Circle();
 c1.area(r);
 }
} 
