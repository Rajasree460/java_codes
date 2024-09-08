/*interface(cal perimeter s c using BufferedReader)*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
interface Shape
{
 void calculatePerimeter(int a);
}
class Square implements Shape
{
 public void calculatePerimeter(int l) {
 System.out.println("sq perimeter: "+4*l);
 }
}
class Circle implements Shape
{
 public void calculatePerimeter(int r) {
 System.out.println("circle perimeter: "+2*3.14f*r);
 }
}
public class interface_sc {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader((new 
       InputStreamReader(System.in)));
        System.out.print("Enter the length: ");
        int l = Integer.parseInt(br.readLine());
        System.out.print("Enter the radius: ");
        int r = Integer.parseInt(br.readLine());
        Square s1 = new Square();
        s1.calculatePerimeter(l);
        Circle c1 = new Circle();
        c1.calculatePerimeter(r);
} 
}