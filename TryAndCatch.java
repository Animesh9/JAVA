//Try and catch
import java.util.Scanner;
class TryAndCatch
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
int a , b ,c=0;
System.out.println("Enter value of a : ");
a = s.nextInt();
System.out.println("Enter value of b : ");
b = s.nextInt();
try{
c=a/b;
System.out.println(a + " divide by "+ b +": = " + c);
}
catch(ArithmeticException e)
{
System.out.println("Exception : " + e.getMessage());
}
}
}
