import java.util.Scanner; //importing Scanner class
public class Calc{
public static void main(String args[])//main...
{
int add, sub, mul, div;
char dec ;
Scanner Calc = new Scanner(System.in);
//DO-WHILE loop for RECURSION
do
{
//Calculator functions
System.out.println("Choose \n1 add \n2 sub\n 3 mul\n4 div " );
int n = Calc.nextInt();
int a=25, b=5;
add= a+b;     //Addition
sub=a-b;      //Subtraction 
mul=a*b;      //Multiply
div=a/b;      //Division
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
System.out.println("if u want to try again press y" );
dec = Calc.next().charAt(0);
}while(dec=='y');//if decisision is y = yes then the loop will recurse again
}
}
