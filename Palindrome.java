import java.io.*; 
import java.util.Scanner;
public class palindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String a=sc.nextLine();
StringBuffer sb=new StringBuffer(a);
sb.reverse();
String s2 = sb.toString(); 
if(a.equals(s2))
{
System.out.println("YES");
}
else
{
System.out.println("NO");
}
}
}
