import java.util.Scanner;
class parameters{
String passorfail(int a)
{
if(35<=a)
{
return "pass";
}
else
{
return "fail";
}
}
public static void main (String args[])
{
Scanner scan = new Scanner(System.in);
int num = scan.nextInt();
parameters mark = new parameters();
String result =mark.passorfail(num);
System.out.println(result);
}
}
