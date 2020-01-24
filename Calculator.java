import java.util.Scanner;

public class Calc{
public static void main(String args[])
{
int add, sub, mul, div;

System.out.println("Choose \n1 add \n2 sub\n 3 mul\n4 div " );
int n = Calc.nextInt();
int a=25, b=5;
add= a+b;
sub=a-b;
mul=a*b;
div=a/b;
if(n==1)
System.out.println("Addition is "+ add );
else if(n==2)
System.out.println("Subtraction is "+ sub );
else if(n==3)
System.out.println("Multiplication is "+ mul );
else if(n==4)
System.out.println("Division is "+ div );
else
System.out.println("Wrong call please try again!!!" );

}
}
