/*calculate avg marks of students in an array*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Student
{
 public void cal_average(int a[])
 {
 double avg,t_marks = 0;
 for (int i=0; i<a.length; i++)
 {
 t_marks += a[i];
 }
 avg = t_marks/a.length;
 System.out.println("Average marks of all students is: " 
+ avg);
 }
}
public class avg_marks {
 public static void main(String[] args) throws IOException {
 BufferedReader br = new BufferedReader(new 
InputStreamReader(System.in));
 System.out.print("Enter number of students: ");
 int num_of_stu = Integer.parseInt(br.readLine());
 int marks[] = new int[num_of_stu];
 for(int i=0; i<num_of_stu; i++)
 {
 System.out.print("Enter marks of student- " + (i+1) 
+ ": ");
 marks[i] = Integer.parseInt(br.readLine());
 }
 Student s1 = new Student();
 s1.cal_average(marks);
 }
}