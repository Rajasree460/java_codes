/*strings sorting*/
public class Sort_Strings {
 public static void main(String[] args) {
 String [] cityname = new String[args.length];
 for (int i = 0; i< cityname.length; i++)
 {
 cityname[i] = args[i];
 }
 for (int i = 0; i< cityname.length; i++)
 {
 for (int j = i+1; j< cityname.length; j++)
 {
 if (cityname[i].compareTo(cityname[j]) > 0)
 {
 String temp = cityname[i];
cityname[i] = cityname[j];
cityname[j] = temp;
 }
 }
 }
 System.out.println("Cities in alphabetical order: ");
 for (int i = 0; i< cityname.length; i++)
 {
 System.out.println(cityname[i]);
 }
 }
}
