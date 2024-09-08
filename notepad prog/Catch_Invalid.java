/*catching invalid cla*/
class Catch_Invalid
{
public static void main(String args[])
{
int invalid=0,num,ct=0;  //invalid=0,no. of invalid args
for(int i=0;i<args.length;i++)
{
try
{
num=Integer.parseInt(args[i]);
}
catch(NumberFormatException e)
{
invalid=invalid+1;      //caught an invalid no.
System.out.println("invalid number: "+args[i]);
continue;              //skip the remaining part of the loop
}
ct=ct+1;
}
System.out.println("valid numbers: "+ct);
System.out.println("invalid numbers: "+invalid);
}
}